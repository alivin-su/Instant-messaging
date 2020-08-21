package com.a.custservice.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.a.custservice.websocket.SocketServer;

@Controller
public class IndexController {

	/**
	 * 登录视图
	 * 
	 * @return
	 */
	@RequestMapping("/login")
	public String login(Model model) {
		model.addAttribute("num", SocketServer.getOnlineNum());
		model.addAttribute("users", SocketServer.getOnlineUsers());
		return "login";
	}

	/**
	 * 注册视图
	 * 
	 * @return
	 */
	@RequestMapping("/register")
	public String register() {
		return "register";
	}

	/**
	 * 聊天会话视图
	 * 
	 * @return
	 */
	@RequestMapping("/message_conver")
	public String message_conver() {
		return "message_conver";
	}

	/**
	 * 好友列表
	 * 
	 * @return
	 */
	@RequestMapping("/friend_list")
	public String friend_list() {
		return "friend_list";
	}


	@RequestMapping("	/sockettest")
	public String sockettest() {
		return "sockettest";
	}

	@RequestMapping("/tongji")
	public String tongji(Model model) {
		model.addAttribute("num", SocketServer.getOnlineNum());
		model.addAttribute("users", SocketServer.getOnlineUsers());
		return "tongji";
	}

	@RequestMapping("/sendmsg")
	@ResponseBody
	public String sendmsg(HttpServletRequest request) {
		String friend_id = request.getParameter("friend_id");
		String user_id = request.getParameter("user_id");
		String msg = request.getParameter("msg");
		String time = request.getParameter("time");
		String msgId = request.getParameter("msgId");
		SocketServer.sendMessage(msg,user_id,friend_id,msgId,time);
		return "success";
	}

//	@RequestMapping("sendAll")
//	@ResponseBody
//	public String sendAll(HttpServletRequest request) {
//		String msg = request.getParameter("msg");
//		SocketServer.sendAll(msg);
//		return "success";
//	}
}
