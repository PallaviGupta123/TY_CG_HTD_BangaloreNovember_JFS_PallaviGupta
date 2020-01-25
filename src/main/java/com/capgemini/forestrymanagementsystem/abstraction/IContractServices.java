package com.capgemini.forestrymanagementsystem.abstraction;

import com.capgemini.forestrymanagementsystem.bean.Contract;

public interface IContractServices {
	public boolean delieverOrder(Contract contract);
	public boolean rejectOrder(int contractId);
	public boolean updateOrder(int contractId,Contract contract);
	public Contract contractLogin(Contract contract);
}
