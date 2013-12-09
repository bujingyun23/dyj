package com.jxsz.service.impl;

import com.jxsz.dao.UserDao;
import com.jxsz.entity.User;
import com.jxsz.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

public UserDao getUserDao() {
  return userDao;
 }

public void setUserDao(UserDao userDao) {
  this.userDao = userDao;
 }

public User getUser(String username, String password) {
  return  userDao.getUser(username, password);
 }
 }
