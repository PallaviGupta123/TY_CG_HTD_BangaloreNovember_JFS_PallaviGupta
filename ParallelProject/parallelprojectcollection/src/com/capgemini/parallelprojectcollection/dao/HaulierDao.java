package com.capgemini.parallelprojectcollection.dao;

import java.util.Set;

import com.capgemini.parallelprojectcollection.abstraction.IHaulierDao;
import com.capgemini.parallelprojectcollection.bean.Hauliers;

public class HaulierDao implements IHaulierDao{

	@Override
	public boolean addHaulier(Hauliers haulier) {
		int count= StaticData.getAllHaulier().size();
		StaticData.addHaulier(haulier);
		int countAfter=StaticData.getAllHaulier().size();
		if(countAfter>count) {
			return true;
		}return false;
		
	}

	@Override
	public boolean deleteHaulier(String haulierId) {
	int count=StaticData.getAllHaulier().size();
	StaticData.deleteHaulier(haulierId);
	int countAfter=StaticData.getAllHaulier().size();
	if(count>countAfter) {
		return true;
	}
		return false;
	}

	@Override
	public Set<Hauliers> getAllHauliers() {
		Set<Hauliers> set=StaticData.getAllHaulier();
		return set;
	}

	@Override
	public boolean editHaulier(String haulierId) {
		// TODO Auto-generated method stub
		return false;
	}

}
