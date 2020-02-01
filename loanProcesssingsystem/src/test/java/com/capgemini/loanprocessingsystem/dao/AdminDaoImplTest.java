package com.capgemini.loanprocessingsystem.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capgemini.loanprocessingsystem.dto.AuthenticationDetails;
import com.capgemini.loanprocessingsystem.exception.CustomException;
@SpringBootTest
class AdminDaoImplTest {
	@Autowired
	private AdminDao adminDao=new AdminDaoImpl();



	@Test
	void testAddEmployeeDetails()   {
		AuthenticationDetails authentication=new AuthenticationDetails();
		authentication.setEmployeeId(103);
		authentication.setEmail("pallaviguptagmail.com");
		authentication.setPassword("qwerty");
		authentication.setEmployeeName("Pallavi");
		authentication.setEmployeeRole("team leader");
		try {
		assertTrue(adminDao.addEmployeeDetails(authentication));
		}
		catch(CustomException customerexception) {
			assertThrows(CustomException.class, () ->{
				adminDao.addEmployeeDetails(authentication);	
			});
		}
	}

	@Test
	void testDeleteEmployeeDetails()   {
		AuthenticationDetails authentication=new AuthenticationDetails();
		authentication.setEmployeeId(103);
		try {
		assertTrue(adminDao.deleteEmployeeDetails(authentication));
		}
		catch(CustomException customException) {
			assertThrows(CustomException.class, ()-> {
				adminDao.deleteEmployeeDetails(authentication);	
			});
		}
	}

}
