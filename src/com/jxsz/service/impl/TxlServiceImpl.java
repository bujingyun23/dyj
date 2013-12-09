package com.jxsz.service.impl;

import java.util.List;
import java.util.Map;

import com.jxsz.dao.TxlDao;
import com.jxsz.entity.TxlBook;
import com.jxsz.service.TxlService;

public class TxlServiceImpl implements TxlService {
	private TxlDao txlDao;

	public List<TxlBook> getTxlList(String page, String rows) throws Exception {
           List<TxlBook> list=txlDao.getTxlList(page,rows);
		return list;
	}

	public int getTxlTotal() throws Exception {
		
		return txlDao.getTxlTotal();
	}

	public void saveTxl(TxlBook txlBook) {
		
		txlDao.saveTxl(txlBook);
	}
	public TxlDao getTxlDao() {
		return txlDao;
	}

	public void setTxlDao(TxlDao txlDao) {
		this.txlDao = txlDao;
	}

	public void deleteTxl(int txlid) {
		txlDao.deleteTxl(txlid);
		
	}

	public void updateTxl(TxlBook txlBook) {
		txlDao.updateTxl(txlBook);
		
	}

	public List<TxlBook> searchTxlList(Map<String, Object> map) {
		 List<TxlBook> list=txlDao.searchTxlList(map);
		return list;
	}

	public int searchTxlTotal(Map<String, Object> map) {

		return txlDao.searchTxlTotal(map);
	}




}
