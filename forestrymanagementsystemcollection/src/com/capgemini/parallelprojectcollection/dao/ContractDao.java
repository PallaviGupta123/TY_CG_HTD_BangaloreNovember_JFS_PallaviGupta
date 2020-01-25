package com.capgemini.parallelprojectcollection.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.capgemini.parallelprojectcollection.abstraction.IClientDao;
import com.capgemini.parallelprojectcollection.abstraction.IContractorDao;
import com.capgemini.parallelprojectcollection.bean.Client;
import com.capgemini.parallelprojectcollection.bean.Contract;
import com.capgemini.parallelprojectcollection.bean.Product;
import com.capgemini.parallelprojectcollection.bean.Request;
import com.capgemini.parallelprojectcollection.exception.CustomerException;

public class ContractDao implements IContractorDao {
   Contract staticContract=new Contract();
   List<Contract> _Contract=new ArrayList<Contract>();

@Override
public boolean delieverOrder(Contract contract) {
	
	return StaticData.deliveOrder(contract);

	
}

@Override
public boolean rejectOrder(int contractId) {
	StaticData.delayDelieveryProduct(contractId);
	return true;
}

@Override
public boolean updateOrder(int contractId, Contract contract) {
	// TODO Auto-generated method stub
	return false;
}
	

	
	

	

}
