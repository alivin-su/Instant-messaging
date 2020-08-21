package com.a.custservice.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.a.custservice.enty.Friend;

public interface FriendMapper {
	/**
	 * 好友列表
	 * @return
	 */
	List<Friend> getFriendList(@Param("user_id")String user_id);
}
