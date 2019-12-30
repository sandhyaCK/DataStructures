package com.bridgeLabz.ObjectOriented;
import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.util.*;

public class Stock_Json {
	
		@SuppressWarnings("unchecked")
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		    JSONObject obj = new JSONObject();
			JSONArray list1 = new JSONArray();
			obj.put("companyName","Growth Stocks");
			obj.put("NumberOfShare",3);
			obj.put("price",150);
			JSONArray list11 = new JSONArray();
			list11.add(obj);
			JSONObject obj111 = new JSONObject();
			obj111.put( "G",list11);
			JSONObject obj1 = new JSONObject();
			obj1.put("companyName","Defensive_Stocks");
			obj1.put("NumberOfShare",5);
			obj1.put("price",155);
			JSONArray list12 = new JSONArray();
			list12.add(obj1);
			JSONObject obj222 = new JSONObject();
			obj222.put("D",list12);
			JSONObject obj2 = new JSONObject();
			obj2.put("Stock_Report",obj111);
			obj2.put("Stock_Report",obj222);
			System.out.println(obj2);
		try 
		{
		 FileWriter filewriter = new FileWriter("MyJson1.json");
		filewriter.write(obj2.toJSONString());
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}}
}
