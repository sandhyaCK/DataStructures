package com.bridgeLabz.ObjectOriented;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Stock_Utility {
	public static void WriteObjFile(File file,JSONObject Obj) {
		FileWriter filewriter=null;
		try 
		{
		filewriter = new FileWriter("StockJson.json");
		filewriter.write(Obj.toJSONString());
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
		public static JSONObject ReadObjFile(File file) 
		{
			 JSONParser parser = new JSONParser();		 
		try(Reader reader = new FileReader(file)){
		JSONObject object = (JSONObject) parser.parse(reader);
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		return null;
		}
		public static void WriteArrayFile(File file,JSONArray jsonArray) {
			FileWriter filewriter=null;
			try 
			{
			filewriter = new FileWriter(file);
			filewriter.write(jsonArray.toJSONString());
			}
			catch(Exception e) 
			{
				e.printStackTrace();
			}
		}
		public static JSONArray ReadArrayFile( File file) 
		{
			 JSONParser parser = new JSONParser();		 
		try(Reader reader = new FileReader(file)){
		JSONArray Array = (JSONArray) parser.parse(reader);
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		return null;
		}
		public static void GetData(JSONArray list) 
		{
		Iterator<Long> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		}
}
