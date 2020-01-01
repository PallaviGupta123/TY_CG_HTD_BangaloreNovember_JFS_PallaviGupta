package com.capgemini.parallelprojectcollection.services;

import java.util.List;

import com.capgemini.parallelprojectcollection.abstraction.IStockDao;
import com.capgemini.parallelprojectcollection.abstraction.IStockService;
import com.capgemini.parallelprojectcollection.bean.Stock;
import com.capgemini.parallelprojectcollection.factory.Factory;

public class StockService implements IStockService{
	IStockDao dao=Factory.objectStockDao();

	@Override
	public boolean addStock(Stock stock) {
		return dao.addStock(stock);
	}

	@Override
	public List<Stock> getAllStock() {
		return dao.getAllStock();	
		}

}
