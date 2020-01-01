package com.capgemini.parallelprojectcollection.dao;

import java.util.Set;

import com.capgemini.parallelprojectcollection.abstraction.ILandDao;
import com.capgemini.parallelprojectcollection.bean.Land;

public class LandDao implements ILandDao{
	@Override
	public boolean addLandDetails(Land land) {
		int beforeAdding=StaticData.getAllLandDetail().size();
		StaticData.addLandDetails(land);
		int afterAdding=StaticData.getAllLandDetail().size();
		if(afterAdding>beforeAdding) {
			return true;
		}return false;
	}

	@Override
	public boolean deleteLandDetails(int landId) {
		int beforeDelete=StaticData.getAllLandDetail().size();
		StaticData.deleteLandDetail(landId);
		int afterDelete=StaticData.getAllLandDetail().size();
		if(beforeDelete>afterDelete) {
			return true;
		}return false;
	}

	@Override
	public boolean editLandDetails(int LandId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<Land> getAllDetail() {
		Set<Land> set=StaticData.getAllLandDetail();
		return set;
	}

}
