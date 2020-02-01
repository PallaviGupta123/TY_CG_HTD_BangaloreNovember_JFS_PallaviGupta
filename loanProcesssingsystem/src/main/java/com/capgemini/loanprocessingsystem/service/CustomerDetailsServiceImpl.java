package com.capgemini.loanprocessingsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.loanprocessingsystem.dao.CustomerDetailsDao;
import com.capgemini.loanprocessingsystem.dto.CustomerDetails;
import com.capgemini.loanprocessingsystem.exception.CustomException;
@Service
public class CustomerDetailsServiceImpl  implements CustomerDetailsService{

	@Autowired
	CustomerDetailsDao customerdetailsdao;

	@Override
	public boolean addCustomer(CustomerDetails customerDetails) throws CustomException {
		// TODO Auto-generated method stub
		return customerdetailsdao.addCustomer(customerDetails);
	}

	@Override
	public List<CustomerDetails> getAllCustomerDetails() throws CustomException {
		// TODO Auto-generated method stub
		return customerdetailsdao.getAllCustomerDetails();
	}

	@Override
	public boolean deleteCustomerDetails(int custId) throws CustomException {
		// TODO Auto-generated method stub
		return customerdetailsdao.deleteCustomerDetails(custId);
	}

	@Override
	public boolean updateCustomerDetails(CustomerDetails customerdetails) throws CustomException {
		// TODO Auto-generated method stub
		return customerdetailsdao.updateCustomerDetails(customerdetails);
	}

	@Override
	public CustomerDetails getCustomerDetailsById(int customerId) throws CustomException {
		// TODO Auto-generated method stub
		return customerdetailsdao.getCustomerDetailsById(customerId);
	}
	
	
}
