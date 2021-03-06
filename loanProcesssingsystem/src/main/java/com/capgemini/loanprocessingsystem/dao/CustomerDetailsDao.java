package com.capgemini.loanprocessingsystem.dao;

import java.util.List;

import com.capgemini.loanprocessingsystem.dto.CustomerDetails;
import com.capgemini.loanprocessingsystem.exception.CustomException;

public interface CustomerDetailsDao {
public boolean addCustomer(CustomerDetails customerDetails) throws CustomException;
public List<CustomerDetails> getAllCustomerDetails() throws CustomException;
public boolean deleteCustomerDetails(int custId) throws CustomException;
public boolean updateCustomerDetails(CustomerDetails customerdetails) throws CustomException;
public CustomerDetails getCustomerDetailsById(int customerId) throws CustomException;
	
	
	
}//end of interface
