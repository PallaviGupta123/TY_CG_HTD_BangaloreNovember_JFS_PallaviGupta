package com.capgemini.parallelprojectcollection.abstraction;

import java.util.Set;

import com.capgemini.parallelprojectcollection.bean.Land;

public interface ILandService {
	public boolean addLandDetails(Land land);
	public boolean deleteLandDetails(int LandId);
	public boolean editLandDetails(int LandId);
	public Set<Land> getAllDetail();

}
