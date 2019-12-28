package com.bridgeLabz.ObjectOriented;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Utility {
	public static void FileWriter(File file,JSONObject jsonObject) {
	FileWriter filewriter=null;
	try {
	filewriter = new FileWriter("MyJson1.json");
	filewriter.write(jsonObject.toJSONString());
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
	public static void FileWriter(File file,JSONArray jsonArray) {
		FileWriter filewriter=null;
		try {
		filewriter = new FileWriter("MyJson1.json");
		filewriter.write(jsonArray.toJSONString());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void ReadFile() {
		 JSONParser parser = new JSONParser();		 
	try(Reader reader = new FileReader("MyJson.json")){
	JSONArray Array = (JSONArray) parser.parse(reader);
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	}
	public static void GetData(JSONArray list1) {
	Iterator<Long> iterator = list1.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	}
	
}