package com.jxsz.dao;

import java.util.List;
import java.util.Map;

import com.jxsz.entity.TxlBook;

public interface TxlDao {
	public List<TxlBook> getTxlList(String page, String rows);
	public int getTxlTotal();
	public void saveTxl(TxlBook txlBook);
	public void deleteTxl(int txlid);
	public void updateTxl(TxlBook txlBook);
	public List<TxlBook> searchTxlList(Map<String, Object> map);
	public int searchTxlTotal(Map<String, Object> map);
}
