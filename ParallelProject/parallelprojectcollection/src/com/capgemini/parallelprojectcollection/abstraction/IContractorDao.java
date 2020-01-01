package com.capgemini.parallelprojectcollection.abstraction;

import com.capgemini.parallelprojectcollection.bean.Contract;
import com.capgemini.parallelprojectcollection.bean.Request;

public interface IContractorDao {
	public boolean acceptRequest(Contract contract);
	public boolean rejectRequest(int requestId);
	public boolean delieverProduct(Contract contract);
}
