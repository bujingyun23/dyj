package com.jxsz.entity;

import java.io.Serializable;
public class TxlBook implements Serializable {
	 private Integer txlid;
	 private String   name ;
	 private String   phone ;
	 private String   qq ;
	 private String   youxiang ;
	 private String   dizhi ;
	 private String   birthday ;
	public Integer getTxlid() {
		return txlid;
	}
	public void setTxlid(Integer txlid) {
		this.txlid = txlid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getYouxiang() {
		return youxiang;
	}
	public void setYouxiang(String youxiang) {
		this.youxiang = youxiang;
	}
	public String getDizhi() {
		return dizhi;
	}
	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	 
	 
}
