package com.capgemini.loanprocessingsystem.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capgemini.loanprocessingsystem.dao.LoanDetailsDao;
import com.capgemini.loanprocessingsystem.dto.LoanDetails;
import com.capgemini.loanprocessingsystem.exception.CustomException;
@SpringBootTest
class LoanDetailsServiceImplTest {

	@Autowired
	private LoanDetailsService loanDetailService;
	

	@Test
	void testAddLoanDetail(){
		LoanDetails loanDetails=new LoanDetails();
		//loanDetails.setLoanId(101);
		loanDetails.setLoanDuration("3year");
		loanDetails.setLoanPOI(23.45);
		loanDetails.setTypeOfLoan("Home Construction Loan");
		try {
		assertTrue(loanDetailService.addLoanDetail(loanDetails));
		} catch(CustomException customException) {
			assertThrows(CustomException.class, () ->
			{
				loanDetailService.addLoanDetail(loanDetails);	
			});
		}
		
	}

	@Test
	void testDeleteLoanDetail()   {
		LoanDetails loanDetails=new LoanDetails();
		loanDetails.setLoanId(101);
		try {
		assertTrue(loanDetailService.deleteLoanDetail(loanDetails.getLoanId()));
		}
		catch(CustomException customException) {
			assertThrows(CustomException.class, () ->
			{
				loanDetailService.deleteLoanDetail(loanDetails.getLoanId());
			});
		}
	}

	@Test
	void testUpdateLoanDetail()   {
		LoanDetails loanDetails=new LoanDetails();
		loanDetails.setLoanId(2);
		loanDetails.setLoanDuration("3year");
		loanDetails.setLoanPOI(23.45);
		loanDetails.setTypeOfLoan("Home extension Loan");
		try {
		assertTrue(loanDetailService.updateLoanDetail(loanDetails));
		}
		catch(CustomException customException) {
			assertThrows(CustomException.class, () ->
			{
				loanDetailService.updateLoanDetail(loanDetails);
			});
			
		}
	}

	@Test
	void testGetAllLoanDetails()   {
		List<LoanDetails> loandetails;
		try {
			loandetails = loanDetailService.getAllLoanDetails();
			assertNotNull(loandetails);
		} catch (CustomException customException) {
			assertThrows(CustomException.class, () ->
			{
				loanDetailService.getAllLoanDetails();
			});
			
		}
		
	}

}
