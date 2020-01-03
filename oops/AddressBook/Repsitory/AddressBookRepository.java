package com.bridgeLabz.ObjectOriented;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class AddressBookRepository {
	static JSONParser jsonParser = new JSONParser();
	static JSONObject jsonObject = new JSONObject();
	static String path = "JsonFile/";

	
	public static void writeData(JSONObject obj) {
		try (FileWriter fileWriter = new FileWriter("addressbook.json")) {
			fileWriter.write(obj.toJSONString());
			System.out.println("Data is added to the file!!!\n\n");
			// AddressBookController.menu();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	public static JSONObject readData() throws org.json.simple.parser.ParseException {
		try {
			jsonObject = (JSONObject) jsonParser.parse(new FileReader("addressbook.json"));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return jsonObject;
	}

	public static JSONObject readDataNew(File file2) throws org.json.simple.parser.ParseException {

		try {
			jsonObject = (JSONObject) jsonParser.parse(new FileReader(file2));
			return jsonObject;
		} catch (IOException  e) {
		 e.printStackTrace();
		}

		return null;
	}

	public static void writeDataNew(JSONObject jsonObject, File file) {
		
		try {
			@SuppressWarnings("resource")
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(jsonObject.toJSONString());
			fileWriter.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
