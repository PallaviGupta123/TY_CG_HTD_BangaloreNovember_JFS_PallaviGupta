package com.capgemini.loanprocessingsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.capgemini.loanprocessingsystem.dto.CustomerDetails;
import com.capgemini.loanprocessingsystem.exception.CustomException;
@Repository
public class CustomerDetailsDaoImpl implements CustomerDetailsDao{
	@PersistenceUnit
	EntityManagerFactory entityManagerFactory;

	@Override
	public boolean addCustomer(CustomerDetails customerDetails) throws CustomException {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		try {
			transaction.begin();
			entityManager.persist(customerDetails);
			transaction.commit();
			return true;
		}
		catch (Exception e) {
			throw new CustomException("Unable to Process The Request Please Try Again");
		}		
	}
	@Override
	public List<CustomerDetails> getAllCustomerDetails() throws CustomException {
		try {
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			String viewall="from CustomerDetails";  
			Query query=entityManager.createQuery(viewall);
			List<CustomerDetails> result= query.getResultList();
			return result;
			}
			catch (Exception e) {
				throw new CustomException("There is Not Data Found In Customer Details");
			}
		}
	@Override
	public boolean deleteCustomerDetails(int custId) throws CustomException {
		// TODO Auto-generated method stub
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		try {
			transaction.begin();
			CustomerDetails pddto=entityManager.find(CustomerDetails.class,custId);
			entityManager.remove(pddto);
			transaction.commit();
			return true;
		}
		catch (Exception e) {
			throw new CustomException("The Data is unable to Delete Please try again");
		}
		
	}

	@Override
	public boolean updateCustomerDetails(CustomerDetails customerdetails) throws CustomException {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		try {
		transaction.begin();
		CustomerDetails customerDetails=entityManager.find(CustomerDetails.class,customerdetails.getCustomerId());
		if(customerDetails!=null) {
		customerDetails.setCustomerName(customerdetails.getCustomerName());
		customerDetails.setCustomerContactNo(customerdetails.getCustomerContactNo());
		customerDetails.setAadharNo(customerdetails.getAadharNo());
		customerDetails.setOccupation(customerDetails.getOccupation());
		customerDetails.setAnnualIncome(customerdetails.getAnnualIncome());
		customerDetails.setAssertId(customerdetails.getAssertId());
		customerDetails.setCustomerAddress(customerDetails.getCustomerAddress());
		customerDetails.setNomineeName(customerdetails.getNomineeName());
		customerDetails.setNomineeContactNo(customerdetails.getNomineeContactNo());
		customerDetails.setNomineePanId(customerdetails.getNomineePanId());
		customerdetails.setLoanAmount(customerdetails.getLoanAmount());
		entityManager.persist(customerDetails);
		transaction.commit();
		return true;
		}
		}
		catch (Exception e) {
			throw new CustomException("The Customer Id that You Have Entered Is Not Exist");
		}
		return false;
	}
	@Override
	public CustomerDetails getCustomerDetailsById(int customerId) throws CustomException {
		try {
			EntityManager entityManager=entityManagerFactory.createEntityManager();	
			CustomerDetails customerDetailsAre=entityManager.find(CustomerDetails.class,customerId);
			return customerDetailsAre;
			}
			catch (Exception e) {
				throw new CustomException("THERE CUSTOMER ID THAT YOU HAVE ENTERED IS NOT PRESENT IN THE DATABASE!!");
			}
	}

	

}//end of class
