package com.cape.moduletestjdbc.dao;

import java.util.List;

import com.cape.moduletestjdbc.bean.Contact;

public interface ContactDao {
	public List<Contact> getAllContactList();
	public List<Contact> search(String name,Contact contact);
	public boolean addContact(Contact contact);
	public boolean modifyContact(int number,Contact contact);
	public boolean deleteContact(int number);
	
	

}
