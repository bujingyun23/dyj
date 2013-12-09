package com.jxsz.dao;

import com.jxsz.entity.User;

public interface UserDao {
  public User getUser(String username,String password);
 }