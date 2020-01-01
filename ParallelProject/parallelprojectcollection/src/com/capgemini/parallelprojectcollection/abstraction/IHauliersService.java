package com.capgemini.parallelprojectcollection.abstraction;

import java.util.Set;

import com.capgemini.parallelprojectcollection.bean.Hauliers;

public interface IHauliersService {
	public boolean addHaulier(Hauliers haulier);
	public boolean deleteHaulier(String haulierId);
	public Set<Hauliers> getAllHauliers();
	public boolean editHaulier(String haulierId);

}
