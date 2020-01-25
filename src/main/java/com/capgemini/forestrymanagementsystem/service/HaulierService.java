package com.capgemini.forestrymanagementsystem.service;

import java.util.List;

import com.capgemini.forestrymanagementsystem.abstraction.IHaulierDao;
import com.capgemini.forestrymanagementsystem.abstraction.IHauliersService;
import com.capgemini.forestrymanagementsystem.bean.Hauliers;
import com.capgemini.forestrymanagementsystem.factory.Factory;

public class HaulierService implements IHauliersService{
	IHaulierDao dao=Factory.objectHaulierDao();

	public boolean addHaulier(Hauliers haulier) {
		return dao.addHaulier(haulier);
	}

	public boolean deleteHaulier(int haulierId) {
		return dao.deleteHaulier(haulierId);
	}

	public List<Hauliers> getAllHauliers() {
		return dao.getAllHauliers();
	}

	public boolean editHaulier(int haulierId, Hauliers haulier) {
		return dao.editHaulier(haulierId, haulier);
	}

	
	

}
