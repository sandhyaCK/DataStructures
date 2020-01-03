package com.bridgeLabz.ObjectOriented;

import java.io.File;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

public interface AddressBookService {
	void store(person person);

	void edit(File file, String name);

	void delete(File file, String name);

	JSONObject search(File file, String name) throws ParseException;

	void addAddressBook(String name);

	void deleteAddressBook(String name);

	File listOfFiles();

}
