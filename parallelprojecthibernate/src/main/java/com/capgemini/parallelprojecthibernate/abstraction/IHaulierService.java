package com.capgemini.parallelprojecthibernate.abstraction;

import java.util.List;

import com.capgemini.parallelprojecthibernate.bean.Haulier;

public interface IHaulierService {
	public boolean addHaulier(Haulier haulier);
	public boolean deleteHaulier(int haulierId);
	public boolean editHaulier(int haulierId,Haulier haulier);
	public List<Haulier> getAllHaulier();

}
