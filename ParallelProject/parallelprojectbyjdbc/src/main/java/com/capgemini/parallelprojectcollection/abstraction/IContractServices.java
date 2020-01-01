package com.capgemini.parallelprojectcollection.abstraction;

import com.capgemini.parallelprojectcollection.bean.Contract;
import com.capgemini.parallelprojectcollection.bean.Request;

public interface IContractServices {
	public boolean acceptRequest(Contract contract);
	public boolean rejectRequest(int customerId);
	public boolean delieverProduct(Contract contract);

}
