package com.capgemini.loanprocessingsystem.service;

import com.capgemini.loanprocessingsystem.dto.AuthenticationDetails;
import com.capgemini.loanprocessingsystem.exception.CustomException;

public interface AdminService {

	public boolean addEmployeeDetails(AuthenticationDetails authentication) throws CustomException ;
	//public boolean modifyEmployeeDetails(AuthenticationDetails authentication) throws CustomException;
	public boolean deleteEmployeeDetails(AuthenticationDetails authentication) throws CustomException;		
}//end of interface
