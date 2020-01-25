package com.capgemini.parallelprojectcollection.abstraction;

import java.util.List;
import java.util.Set;

import com.capgemini.parallelprojectcollection.bean.Hauliers;

public interface IHaulierDao {
	public boolean addHaulier(Hauliers haulier);
	public boolean deleteHaulier(int haulierId);
	public List<Hauliers> getAllHauliers();
	public boolean editHaulier(int haulierId, Hauliers haulier);
}
