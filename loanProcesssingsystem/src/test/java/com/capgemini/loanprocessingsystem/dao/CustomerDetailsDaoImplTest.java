package com.capgemini.loanprocessingsystem.dao;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capgemini.loanprocessingsystem.dto.CustomerDetails;
import com.capgemini.loanprocessingsystem.exception.CustomException;
@SpringBootTest
class CustomerDetailsDaoImplTest {
	@Autowired
	private CustomerDetailsDao customerDetailDao;


	@Test
	void testAddCustomer() {
		CustomerDetails customerDetails=new CustomerDetails();
		customerDetails.setAadharNo("2024341823452");
		customerDetails.setAnnualIncome(34215.3);
		customerDetails.setAssertId(201);
		customerDetails.setCustomerAddress("TamilNadu");
		customerDetails.setCustomerContactNo(99184923428L);
		customerDetails.setCustomerId(111);
		customerDetails.setCustomerName("Anuskha");
		customerDetails.setLoanAmount(300000);
		customerDetails.setNomineeContactNo(1234567890l);
		customerDetails.setNomineeName("Manju");
		customerDetails.setNomineePanId("TL23XBW78");
		customerDetails.setOccupation("Student");
		try {
			assertTrue(customerDetailDao.addCustomer(customerDetails));
		} 
		catch (CustomException customException) {
			assertThrows(CustomException.class, () ->
			{
				customerDetailDao.addCustomer(customerDetails);
			});
		}
		
	}

	@Test
	void testGetAllCustomerDetails() {
		try {
			List<CustomerDetails> customerDetails=customerDetailDao.getAllCustomerDetails();
			assertNotNull(customerDetails);
		}
			catch (CustomException customException) {
				assertThrows(CustomException.class, () ->
				{
					customerDetailDao.getAllCustomerDetails();
				});
		}
	}


	@Test
	void testUpdateCustomerDetails() {
		CustomerDetails customerDetails=new CustomerDetails();
		customerDetails.setAadharNo("202481823452");
		customerDetails.setAnnualIncome(12345.3);
		customerDetails.setAssertId(111);
		customerDetails.setCustomerAddress("Gorakhpur");
		customerDetails.setCustomerContactNo(7007631059l);
		customerDetails.setCustomerId(3);
		customerDetails.setCustomerName("Pallavi");
		customerDetails.setLoanAmount(200000);
		customerDetails.setNomineeContactNo(7007314648l);
		customerDetails.setNomineeName("Vaishna");
		customerDetails.setNomineePanId("UP34BXE2");
		customerDetails.setOccupation("TeamLead");
		try {
			assertTrue(customerDetailDao.updateCustomerDetails(customerDetails));
		} catch (CustomException customException) {
			assertThrows(CustomException.class, () ->
			{
				customerDetailDao.updateCustomerDetails(customerDetails);	
			});
		
		}
		
	}

	@Test
	void testGetCustomerDetailsById() {
		CustomerDetails customerDetail=new CustomerDetails();
		customerDetail.setCustomerId(3);
		try {
			assertNotNull(customerDetailDao.getCustomerDetailsById(customerDetail.getCustomerId()));
		}
		catch(CustomException customerException) {
			assertThrows(CustomException.class, () ->
			{
				customerDetailDao.getCustomerDetailsById(customerDetail.getCustomerId());
			});
		}
	}

	@Test
	void testDeleteCustomerDetails() {
		CustomerDetails customerdetails=new CustomerDetails();
		customerdetails.setCustomerId(111);
		try {
			assertTrue(customerDetailDao.deleteCustomerDetails(customerdetails.getCustomerId()));
		}  catch (CustomException customException) {
			assertThrows(CustomException.class, () ->
			{
				customerDetailDao.deleteCustomerDetails(customerdetails.getCustomerId());
			});
		}
	}
}
