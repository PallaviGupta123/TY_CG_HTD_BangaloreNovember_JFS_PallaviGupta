package com.capgemini.forestrymanagementsystem.abstraction;

import java.util.List;

import com.capgemini.forestrymanagementsystem.bean.Hauliers;

public interface IHauliersService {
	public boolean addHaulier(Hauliers haulier);
	public boolean deleteHaulier(int haulierId);
	public List<Hauliers> getAllHauliers();
	public boolean editHaulier(int haulierId, Hauliers haulier);

}
