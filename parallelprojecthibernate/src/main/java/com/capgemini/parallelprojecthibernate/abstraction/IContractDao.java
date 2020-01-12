package com.capgemini.parallelprojecthibernate.abstraction;

import java.util.List;

import com.capgemini.parallelprojecthibernate.bean.Contract;

public interface IContractDao {
	public boolean acceptRequest(Contract contract);
	public boolean rejectRequest(int orderId);
	public boolean delieverProduct(Contract contract);
	public List<Contract> getAllRequest();

}
