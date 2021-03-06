package com.a.custservice.websocket;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.websocket.EncodeException;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

import org.springframework.stereotype.Component;

import com.a.custservice.enty.Message;

@ServerEndpoint(value = "/socketServer/{userid}", encoders = { ServerEncoder.class })
@Component
public class SocketServer {

	private Session session;
	private static Map<String,Session> sessionPool = new HashMap<>();
	private static Map<String,String> sessionIds = new HashMap<>();
	
	@OnOpen
	public void open(Session session,@PathParam(value="userid")String userid){
		this.session = session;
		sessionPool.put(userid, session);
		sessionIds.put(session.getId(), userid);
	}
	
	@OnMessage
	public void onMessage(String message){
		System.out.println("当前发送人sessionid为"+session.getId()+"发送内容为"+message);
	}
	
	@OnClose
	public void onClose(){
		sessionPool.remove(sessionIds.get(session.getId()));
		sessionIds.remove(session.getId());
	}
	
    @OnError
    public void onError(Session session, Throwable error) {
        error.printStackTrace();
    }
	
	public static void sendMessage(String message,String userId,String friendId,String msgId,String time){
		Message messageEntity = new Message();
		messageEntity.setContent(message);
		messageEntity.setMsgId(msgId);
		messageEntity.setSendId(userId);
		messageEntity.setTime(time);
		messageEntity.setReceiveId(friendId);
		Session s = sessionPool.get(friendId);
		if(s!=null){
			try {
				s.getBasicRemote().sendObject(messageEntity);;
			} catch (IOException e) {
				e.printStackTrace();
			} catch (EncodeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static int getOnlineNum(){
		return sessionPool.size();
	}
	
	public static String getOnlineUsers(){
		StringBuffer users = new StringBuffer();
	    for (String key : sessionIds.keySet()) {
		   users.append(sessionIds.get(key)+",");
		}
	    return users.toString();
	}

//	public static void sendAll(String msg) {
//		for (String key : sessionIds.keySet()) {
//			sendMessage(msg, sessionIds.get(key));
//	    }
//	}
}
