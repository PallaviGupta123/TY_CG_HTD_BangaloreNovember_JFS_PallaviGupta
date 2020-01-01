package com.capgemini.parallelprojectcollection.dao;

import java.util.List;

import com.capgemini.parallelprojectcollection.abstraction.IStockDao;
import com.capgemini.parallelprojectcollection.bean.Client;
import com.capgemini.parallelprojectcollection.bean.Stock;

public class StockDao implements IStockDao{

	@Override
	public boolean addStock(Stock stock) {
		int count= StaticData.getAllStock().size();
		StaticData.addStock(stock);
		int countAfter=StaticData.getAllStock().size();
		if(countAfter>count) {
			return true;
		}
		
		 return false;
	}

	@Override
	public List<Stock> getAllStock() {
		List<Stock> s1=StaticData.getAllStock();
		  return s1;
	}

}
