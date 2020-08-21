package com.a.custservice.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.a.custservice.enty.Friend;
import com.a.custservice.enty.Message;

public interface MessageMapper {
	
	/**
	 * 获取消息好友列表
	 * @return
	 */
	List<Friend> getFriendList(@Param("user_id")String user_id);
	/**
	 * 获取消息(单个好友)
	 * @return
	 */
	List<Message> geMessageList(@Param("user_id")String user_id,@Param("friend_id")String friend_id);
	
	/**
	 * 存储消息
	 * @return
	 */
	void saveMessage(Message message);
}
