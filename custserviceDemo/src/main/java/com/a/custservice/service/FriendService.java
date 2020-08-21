package com.a.custservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.a.custservice.enty.Friend;
import com.a.custservice.mapper.FriendMapper;
@Service
public class FriendService {
	/**
	 * 注入服务
	 */
	@Autowired
	private FriendMapper friendMapper;

	/**
	 * 获取消息视图的好友列表
	 * @return
	 */
	public List<Friend> getFriendList(String user_id) {
		List<Friend> bean = null;
		bean = friendMapper.getFriendList(user_id);
		if (bean != null && bean.size() > 0) {
			return bean;
		}
		return null;
	}
}
