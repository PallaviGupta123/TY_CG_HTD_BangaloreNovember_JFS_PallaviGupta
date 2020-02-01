package com.capgemini.loanprocessingsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.loanprocessingsystem.dao.LoanDetailsDao;
import com.capgemini.loanprocessingsystem.dto.LoanDetails;
import com.capgemini.loanprocessingsystem.exception.CustomException;
@Service
public class LoanDetailsServiceImpl implements LoanDetailsService  {

	@Autowired
	LoanDetailsDao loandetailsdao;
	
	@Override
	public boolean addLoanDetail(LoanDetails loanDetail) throws CustomException {
		// TODO Auto-generated method stub
		return loandetailsdao.addLoanDetail(loanDetail);
	}

	@Override
	public boolean deleteLoanDetail(int loanId) throws CustomException {
		// TODO Auto-generated method stub
		
		return loandetailsdao.deleteLoanDetail(loanId);
	}

	@Override
	public boolean updateLoanDetail( LoanDetails loandetails) throws CustomException {
		// TODO Auto-generated method stub
		return loandetailsdao.updateLoanDetail(loandetails);
	}

	@Override
	public List<LoanDetails> getAllLoanDetails() throws CustomException {
		// TODO Auto-generated method stub
		return loandetailsdao.getAllLoanDetails();
	}

}
