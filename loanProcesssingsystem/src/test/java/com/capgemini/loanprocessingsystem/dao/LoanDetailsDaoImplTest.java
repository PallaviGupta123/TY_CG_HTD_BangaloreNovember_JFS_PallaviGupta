package com.capgemini.loanprocessingsystem.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capgemini.loanprocessingsystem.dto.LoanDetails;
import com.capgemini.loanprocessingsystem.exception.CustomException;
@SpringBootTest
class LoanDetailsDaoImplTest {
	@Autowired
	private LoanDetailsDao loanDeatilDao;
	


	@Test
	void testAddLoanDetail(){
		LoanDetails loanDetails=new LoanDetails();
		//loanDetails.setLoanId(101);
		loanDetails.setLoanDuration("3year");
		loanDetails.setLoanPOI(23.45);
		loanDetails.setTypeOfLoan("Home Construction Loan");
		try {
		assertTrue(loanDeatilDao.addLoanDetail(loanDetails));
		} catch(CustomException customException) {
			assertThrows(CustomException.class, () ->
			{
				loanDeatilDao.addLoanDetail(loanDetails);	
			});
		}
		
	}

//	@Test
//	void testDeleteLoanDetail()   {
//		LoanDetails loanDetails=new LoanDetails();
//		loanDetails.setLoanId(101);
//		try {
//		assertTrue(loanDeatilDao.deleteLoanDetail(loanDetails.getLoanId()));
//		}
//		catch(CustomException customException) {
//			assertThrows(CustomException.class, () ->
//			{
//				loanDeatilDao.deleteLoanDetail(loanDetails.getLoanId());
//			});
//		}
//	}
//
//	@Test
//	void testUpdateLoanDetail()   {
//		LoanDetails loanDetails=new LoanDetails();
//		loanDetails.setLoanId(2);
//		loanDetails.setLoanDuration("3year");
//		loanDetails.setLoanPOI(23.45);
//		loanDetails.setTypeOfLoan("Home extension Loan");
//		try {
//		assertTrue(loanDeatilDao.updateLoanDetail(loanDetails));
//		}
//		catch(CustomException customException) {
//			assertThrows(CustomException.class, () ->
//			{
//				loanDeatilDao.updateLoanDetail(loanDetails);
//			});
//			
//		}
//	}
//
//	@Test
//	void testGetAllLoanDetails()   {
//		List<LoanDetails> loandetails;
//		try {
//			loandetails = loanDeatilDao.getAllLoanDetails();
//			assertNotNull(loandetails);
//		} catch (CustomException customException) {
//			assertThrows(CustomException.class, () ->
//			{
//				loanDeatilDao.getAllLoanDetails();
//			});
//			
//		}
//		
//	}

}
