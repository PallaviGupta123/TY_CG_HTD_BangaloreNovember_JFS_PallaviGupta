package com.capgemini.loanprocessingsystem.service;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capgemini.loanprocessingsystem.dto.CustomerDetails;
import com.capgemini.loanprocessingsystem.exception.CustomException;
@SpringBootTest
class CustomerDetailsServiceImplTest {

	@Autowired
	private CustomerDetailsService customerDetailService;

	@Test
	void testAddCustomer() {
		CustomerDetails customerDetails=new CustomerDetails();
		customerDetails.setAadharNo("2024341823452");
		customerDetails.setAnnualIncome(34215.3);
		customerDetails.setAssertId(201);
		customerDetails.setCustomerAddress("TamilNadu");
		customerDetails.setCustomerContactNo(99184923428L);
		customerDetails.setCustomerId(101);
		customerDetails.setCustomerName("Vaishna");
		customerDetails.setLoanAmount(300000);
		customerDetails.setNomineeContactNo(1234567890l);
		customerDetails.setNomineeName("santosh");
		customerDetails.setNomineePanId("TL23XBW78");
		customerDetails.setOccupation("Student");
		try {
			assertTrue(customerDetailService.addCustomer(customerDetails));
		} 
		catch (CustomException customException) {
			assertThrows(CustomException.class, () ->
			{
				customerDetailService.addCustomer(customerDetails);
			});
		}
		
	}

	@Test
	void testGetAllCustomerDetails() {
		try {
			List<CustomerDetails> customerDetails=customerDetailService.getAllCustomerDetails();
			assertNotNull(customerDetails);
		}
			catch (CustomException customException) {
				assertThrows(CustomException.class, () ->
				{
					customerDetailService.getAllCustomerDetails();
				});
		}
	}

	@Test
	void testDeleteCustomerDetails() {
		CustomerDetails customerdetails=new CustomerDetails();
		customerdetails.setCustomerId(101);
		try {
			assertTrue(customerDetailService.deleteCustomerDetails(customerdetails.getCustomerId()));
		}  catch (CustomException customException) {
			assertThrows(CustomException.class, () ->
			{
				customerDetailService.deleteCustomerDetails(customerdetails.getCustomerId());
			});
		}
	}

	@Test
	void testUpdateCustomerDetails() {
		CustomerDetails customerDetails=new CustomerDetails();
		customerDetails.setAadharNo("202481823452");
		customerDetails.setAnnualIncome(12345.3);
		customerDetails.setAssertId(101);
		customerDetails.setCustomerAddress("Gorakhpur");
		customerDetails.setCustomerContactNo(7007631059l);
		customerDetails.setCustomerId(101);
		customerDetails.setCustomerName("Pallavi");
		customerDetails.setLoanAmount(200000);
		customerDetails.setNomineeContactNo(7007314648l);
		customerDetails.setNomineeName("Vaishna");
		customerDetails.setNomineePanId("UP34BXE2");
		customerDetails.setOccupation("TeamLead");
		try {
			assertTrue(customerDetailService.updateCustomerDetails(customerDetails));
		} catch (CustomException customException) {
			assertThrows(CustomException.class, () ->
			{
				customerDetailService.updateCustomerDetails(customerDetails);	
			});
		
		}
		
	}

	@Test
	void testGetCustomerDetailsById() {
		CustomerDetails customerDetail=new CustomerDetails();
		customerDetail.setCustomerId(101);
		try {
			assertNotNull(customerDetailService.getCustomerDetailsById(customerDetail.getCustomerId()));
		}
		catch(CustomException customerException) {
			assertThrows(CustomException.class, () ->
			{
				customerDetailService.getCustomerDetailsById(customerDetail.getCustomerId());
			});
		}
	}
}
