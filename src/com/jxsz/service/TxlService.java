package com.jxsz.service;

import java.util.List;
import java.util.Map;

import com.jxsz.entity.TxlBook;


public interface TxlService {
	/**
	 * 根据第几页获取，每页几行获取数据
	 */
	 public List<TxlBook> getTxlList(String page,String rows) throws Exception; 
	 /**
	 * 统计一共有多少数据 
	 */
     public int getTxlTotal() throws Exception;
     /**
 	 * 保存新增通讯录信息 
 	 */
	public void saveTxl(TxlBook txlBook);
	 /**
 	 * 删除通讯录信息 
 	 */
	public void deleteTxl(int txlid);
	 /**
 	 *修改通讯录信息 
 	 */
	public void updateTxl(TxlBook txlBook);
	 /**
 	 *根据条件查询 通讯录信息
 	 */
	public List<TxlBook> searchTxlList(Map<String, Object> map);
	 /**
 	 *根据条件查询相应 通讯录信息总数
 	 */
	public int searchTxlTotal(Map<String, Object> map);

}
