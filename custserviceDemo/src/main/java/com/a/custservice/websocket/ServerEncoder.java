package com.a.custservice.websocket;

import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

import com.a.custservice.enty.Message;
import com.alibaba.fastjson.JSON;

/**
 * websocket 解码器
 * @author Asion
 *
 */
public class ServerEncoder implements Encoder.Text<Message>{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(EndpointConfig arg0) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 使用fastjson 的方法，将对实体象转化为json格式
	 */
	@Override
	public String encode(Message arg0) throws EncodeException {
		// TODO Auto-generated method stub
		return JSON.toJSONString(arg0);
	}

}
