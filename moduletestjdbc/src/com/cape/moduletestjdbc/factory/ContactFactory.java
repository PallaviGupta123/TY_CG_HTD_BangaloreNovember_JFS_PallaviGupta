package com.cape.moduletestjdbc.factory;

import com.cape.moduletestjdbc.dao.ContactDao;
import com.cape.moduletestjdbc.dao.ContactDaoImpl;
import com.cape.moduletestjdbc.services.ContactServices;
import com.cape.moduletestjdbc.services.ContactServiesImpl;

public class ContactFactory {
	
	public static ContactServices instanceOfServices()
	{
		ContactServices services=(ContactServices) new ContactServiesImpl();
		return services;
	}
	public static ContactDao instanceOfCustomerDaoImpl()
	{
		ContactDao dao=(ContactDao) new ContactDaoImpl();
		return  dao;
	}

}
