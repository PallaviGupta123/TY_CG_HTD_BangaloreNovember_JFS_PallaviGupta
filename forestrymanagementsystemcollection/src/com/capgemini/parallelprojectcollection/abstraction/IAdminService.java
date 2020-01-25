package com.capgemini.parallelprojectcollection.abstraction;

import java.util.List;

import com.capgemini.parallelprojectcollection.bean.Admin;
import com.capgemini.parallelprojectcollection.bean.Contract;

public interface IAdminService {
	public Admin adminLogin(Admin admin);
	public boolean addContract(Contract contract);
	public boolean deleteContract(int contractId);
	public boolean editContract(int contractId);
	public List<Contract> getAllContract();


}
