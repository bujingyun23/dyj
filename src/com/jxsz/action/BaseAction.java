package com.jxsz.action;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
 import org.apache.struts2.interceptor.ServletRequestAware;
 import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport implements
 ServletRequestAware ,ServletResponseAware{
  private static final long serialVersionUID = 1L;
  
  public Logger log = Logger.getLogger(this.getClass());
  
  protected HttpServletRequest request;
     protected HttpServletResponse response ;
     public String msg = "";
     
  public BaseAction() {
   super();
  }

 public void setServletRequest(HttpServletRequest request) {
       this.request = request;
    }

 public void setServletResponse(HttpServletResponse response){
      this.response=response;
  }

 protected void responseSendMsg(HttpServletResponse response ,String strMsg){
   try {
    response.setContentType("application/json;charset=utf-8");
    response.setCharacterEncoding("utf-8");
    response.getWriter().write(strMsg);
    response.getWriter().flush();
    response.getWriter().close();
   } catch (IOException e) {
    log.error(e.getStackTrace());
   }
  }

}
