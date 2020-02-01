package com.capgemini.loanprocessingsystem.dao;

import java.util.List;

import com.capgemini.loanprocessingsystem.dto.LoanDetails;
import com.capgemini.loanprocessingsystem.exception.CustomException;

public interface LoanDetailsDao {
	public boolean addLoanDetail(LoanDetails loanDetail) throws CustomException;
	public boolean deleteLoanDetail(int loanId) throws CustomException;
	public boolean updateLoanDetail(LoanDetails loanDetail) throws CustomException;
	public List<LoanDetails> getAllLoanDetails() throws CustomException;

}//end of interface
