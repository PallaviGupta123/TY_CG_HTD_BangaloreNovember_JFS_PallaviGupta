package com.capgemini.parallelprojectcollection.abstraction;

import com.capgemini.parallelprojectcollection.bean.Contract;
import com.capgemini.parallelprojectcollection.bean.Request;

public interface IContractServices {
	public boolean delieverOrder(Contract contract);
	public boolean rejectOrder(int contractId);
	public boolean updateOrder(int contractId,Contract contract);
}
