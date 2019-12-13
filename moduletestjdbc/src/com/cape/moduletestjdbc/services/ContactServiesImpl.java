package com.cape.moduletestjdbc.services;

import java.util.List;

import com.cape.moduletestjdbc.bean.Contact;
import com.cape.moduletestjdbc.dao.ContactDao;
import com.cape.moduletestjdbc.factory.ContactFactory;

public class ContactServiesImpl implements ContactServices 
{
     ContactDao dao=ContactFactory.instanceOfCustomerDaoImpl();
	@Override
	public List<Contact> getAllContactList() {
		return dao.getAllContactList();
	}

	

	@Override
	public boolean addContact(Contact contact) {
		
		return dao.addContact(contact);
	}

	@Override
	public boolean modifyContact(int number,Contact contact) {
		
		return dao.modifyContact(number,contact);
	}

	@Override
	public boolean deleteContact(int number) {
		
		return dao.deleteContact(number);
	}



	@Override
	public List<Contact> search(String name, Contact contact) {
		return dao.search(name, contact);
	}

}
