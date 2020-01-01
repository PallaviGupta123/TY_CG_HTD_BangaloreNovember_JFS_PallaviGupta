package com.capgemini.parallelprojectcollection.abstraction;

import java.util.List;

import com.capgemini.parallelprojectcollection.bean.Stock;

public interface IStockDao {
	public boolean addStock(Stock stock);
	public List<Stock> getAllStock();
	
}
