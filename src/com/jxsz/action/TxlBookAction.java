package com.jxsz.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jxsz.common.ToBeJson;
import com.jxsz.entity.TxlBook;
import com.jxsz.service.TxlService;


public class TxlBookAction extends BaseAction {
	/**
	 * 获取通讯录信息
	 */
	private static final long serialVersionUID = 1L;
    private TxlService txlService;
    private TxlBook txlBook;
    private String rows; 
	private String page;
	/**
	 * 查询通讯录信息 及总数
	 */
    public String getAllTxl()throws Exception{     
    	 List<TxlBook> list=txlService.getTxlList(page,rows);
    	 log.info("查询通讯录信息成功");   
    	 int total=txlService.getTxlTotal();
    	 log.info("查询通讯录总数成功");  
    	 ToBeJson toBeJson=new ToBeJson();
    	 toBeJson.execute(list,total);  
    	 return null;		
    }
    /**
	 * 保存新增通讯录信息
	 */
    public String saveTxl() throws Exception{  
    	txlService.saveTxl(txlBook);  
    	log.info("保存新增通讯录信息");
    	return null;
    }
    /**
	 * 删除通讯录信息
	 */
    public String deleteTxl() throws Exception{
    	String items=request.getParameter("items");
    	String[] ids=items.split(",");
    	for (int i = 0; i < ids.length; i++) { 
    		txlService.deleteTxl(Integer.parseInt(ids[i])); 
        } 
    	txlService.deleteTxl(19);
    	return null;
    }
    /**
	 * 修改通讯录信息
	 */ 
    public String updateTxl() throws Exception{
		 TxlBook txl=new TxlBook();
		 String txlid=request.getParameter("txlid");
		 String name=request.getParameter("name");
		 String youxiang=request.getParameter("youxiang");
		 String phone=request.getParameter("phone");
		 String qq=request.getParameter("qq");
		 String dizhi=request.getParameter("dizhi");
		 String birthday=request.getParameter("birthday");
		 txl.setTxlid(Integer.parseInt(txlid));
		 txl.setName(name);
		 txl.setYouxiang(youxiang);
		 txl.setPhone(phone);
		 txl.setQq(qq);
		 txl.setDizhi(dizhi);
		 txl.setBirthday(birthday);
		 
		 
		 
		 txlService.updateTxl(txl);
		 log.info("修改通讯录信息成功");
		 return null;
	 }
    /**
	 *根据条件查询通讯录信息
	 */   
    public String searchTxl() throws Exception{
    	Map<String, Object> map=new HashMap<String, Object>();
    	String name=request.getParameter("name");
    	String youxiang=request.getParameter("youxiang");
    	String phone=request.getParameter("phone");
    	
    	map.put("name", name);
    	map.put("youxiang", youxiang);
    	map.put("phone", phone);
    	map.put("rows", rows);
    	map.put("page", page);
    	
    	List<TxlBook> list=txlService.searchTxlList(map);
    	int total=txlService.searchTxlTotal(map);
    	
    	 ToBeJson toBeJson=new ToBeJson();
    	 toBeJson.execute(list,total);  
    	
    	 return null;
	 }
    
		public String getRows() {
			return rows;
		}
		public void setRows(String rows) {
			this.rows = rows;
		}
		public String getPage() {
			return page;
		}
		public void setPage(String page) {
			this.page = page;
		}
		public TxlService getTxlService() {
			return txlService;
		}
		public void setTxlService(TxlService txlService) {
			this.txlService = txlService;
		}
		public TxlBook getTxlBook() {
			return txlBook;
		}
		public void setTxlBook(TxlBook txlBook) {
			this.txlBook = txlBook;
		}

}
