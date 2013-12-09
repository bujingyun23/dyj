package com.jxsz.action;

import com.jxsz.entity.User;
import com.jxsz.service.UserService;

public class LoginAction extends BaseAction {
 
	private static final long serialVersionUID = 1L;
	private UserService userService;
    private User user1;

 public String login(){
  String username=user1.getUserName();
  String password=user1.getPassWord();
  User user =userService.getUser(username,password);
  if(user!=null){
   log.info("登录成功");
   return "success";
  }else{
   log.info("登录失败");
   return "error";
  }
 }


public User getUser1() {
	return user1;
}


public void setUser1(User user1) {
	this.user1 = user1;
}


public UserService getUserService() {
  return userService;
 }

public void setUserService(UserService userService) {
  this.userService = userService;
 }
 }
