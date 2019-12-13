package com.cape.moduletestjdbc.services;

import java.util.List;

import com.cape.moduletestjdbc.bean.Contact;

public interface ContactServices2 {
	public List<Contact> getAllContactList();
	public List<Contact> search(String name,Contact contact);
	public boolean addContact(Contact contact);
	public boolean modifyContact(int number,Contact contact);
	public boolean deleteContact(int number);
	

}
