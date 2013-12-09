package com.jxsz.dao.impl;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.jxsz.dao.UserDao;
import com.jxsz.entity.User;
public class UserDaoImpl implements UserDao{
  private HibernateTemplate hibernateTemplate;
  public HibernateTemplate getHibernateTemplate() {
   return hibernateTemplate;
  }
  public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
   this.hibernateTemplate = hibernateTemplate;
  }
/*  public Session getSession(){
   return hibernateTemplate.getSessionFactory().getCurrentSession();
  }*/
  public User getUser(String username, String password) {
   return (User) hibernateTemplate.getSessionFactory().getCurrentSession().createQuery("from User as user where user.userName=?and user.passWord=?").setString(0, username).setString(1,password).uniqueResult();
  }
 }