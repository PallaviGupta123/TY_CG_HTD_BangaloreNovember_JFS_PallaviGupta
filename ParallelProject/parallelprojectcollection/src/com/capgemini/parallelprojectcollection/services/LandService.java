package com.capgemini.parallelprojectcollection.services;

import java.util.Set;

import com.capgemini.parallelprojectcollection.abstraction.ILandDao;
import com.capgemini.parallelprojectcollection.abstraction.ILandService;
import com.capgemini.parallelprojectcollection.bean.Land;
import com.capgemini.parallelprojectcollection.factory.Factory;

public class LandService implements ILandService{
	ILandDao dao=Factory.objectLandDao();

	@Override
	public boolean addLandDetails(Land land) {
		return dao.addLandDetails(land);
	}

	@Override
	public boolean deleteLandDetails(int LandId) {
		return dao.deleteLandDetails(LandId);
	}

	@Override
	public boolean editLandDetails(int LandId) {
		return dao.editLandDetails(LandId);
	}

	@Override
	public Set<Land> getAllDetail() {
		return dao.getAllDetail();
	}

}
