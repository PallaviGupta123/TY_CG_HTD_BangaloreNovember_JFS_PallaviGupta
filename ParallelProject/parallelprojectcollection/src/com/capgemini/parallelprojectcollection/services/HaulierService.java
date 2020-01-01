package com.capgemini.parallelprojectcollection.services;

import java.util.Set;

import com.capgemini.parallelprojectcollection.abstraction.IHaulierDao;
import com.capgemini.parallelprojectcollection.abstraction.IHauliersService;
import com.capgemini.parallelprojectcollection.bean.Hauliers;
import com.capgemini.parallelprojectcollection.factory.Factory;

public class HaulierService implements IHauliersService{
	IHaulierDao dao=Factory.objectHaulierDao();

	@Override
	public boolean addHaulier(Hauliers haulier) {
		return dao.addHaulier(haulier);
	}

	@Override
	public boolean deleteHaulier(String haulierId) {
		return dao.deleteHaulier(haulierId);
	}

	@Override
	public Set<Hauliers> getAllHauliers() {
		return dao.getAllHauliers();
	}

	@Override
	public boolean editHaulier(String haulierId) {
		return dao.editHaulier(haulierId);
	}

}
