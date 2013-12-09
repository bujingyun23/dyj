package com.jxsz.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.jxsz.dao.TxlDao;
import com.jxsz.entity.TxlBook;


public class TxlDaoImpl implements TxlDao {
	 private HibernateTemplate hibernateTemplate;
	  public HibernateTemplate getHibernateTemplate() {
	   return hibernateTemplate;
	  }
	  public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
	   this.hibernateTemplate = hibernateTemplate;
	  }
	public List<TxlBook> getTxlList(String page, String rows) {
		    
		int currentpage = Integer.parseInt((page == null || page == "0") ? "1": page);//第几页  
		int pagesize = Integer.parseInt((rows == null || rows == "0") ? "10": rows);//每页多少行  
		         
		List<TxlBook>  list =  getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from TxlBook").setFirstResult((currentpage - 1) * pagesize).setMaxResults(pagesize).list();    
		
		return list;

	}
	public int getTxlTotal() {
		int total;
		total=   getHibernateTemplate().getSessionFactory().getCurrentSession().find("from TxlBook").size();
		return total;
	}
	public void saveTxl(TxlBook txlBook) {
		  getHibernateTemplate().getSessionFactory().getCurrentSession().save(txlBook);
	}
	public void deleteTxl(int txlid) {
		String hql = "delete from TxlBook txl where txl.txlid='"+ txlid + "'";
		 getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(hql).executeUpdate();
	}
	public void updateTxl(TxlBook txlBook) {
		  getHibernateTemplate().getSessionFactory().getCurrentSession().update(txlBook);
		
	}
	public List<TxlBook> searchTxlList(Map<String, Object> map) {
		String page=(String) map.get("page");
		String rows=(String) map.get("rows");
		String name=(String) map.get("name");
		String youxiang=(String) map.get("youxiang");
		String phone=(String) map.get("phone");
		int currentpage = Integer.parseInt((page == null || page == "0") ? "1": page);//第几页  
		int pagesize = Integer.parseInt((rows == null || rows == "0") ? "10": rows);//每页多少行  
		List<TxlBook>  list =  getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from TxlBook txl where txl.name='"+name+"'or txl.phone='"+phone+"'or txl.youxiang='"+youxiang+"'").setFirstResult((currentpage - 1) * pagesize).setMaxResults(pagesize).list();    
		
		return list;
	}
	public int searchTxlTotal(Map<String, Object> map) {
		String name=(String) map.get("name");
		String youxiang=(String) map.get("youxiang");
		String phone=(String) map.get("phone");
		int total=   getHibernateTemplate().getSessionFactory().getCurrentSession().find("from TxlBook txl where txl.name='"+name+"'or txl.phone='"+phone+"'or txl.youxiang='"+youxiang+"'").size();
		return total;
	}

	
}
