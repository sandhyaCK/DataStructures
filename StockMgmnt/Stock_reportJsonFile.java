package com.bridgeLabz.ObjectOriented;

import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.util.*;
public class Stock_reportJsonFile {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	JSONObject obj = new JSONObject();
		JSONArray list1 = new JSONArray();
		obj.put("Stock_Names","Growth Stocks");
		obj.put("No_Of_Shares",3);
		obj.put("Share_Price",150);
		JSONObject obj1 = new JSONObject();
		obj1.put("Stock_Names","Defensive_Stocks");
		obj1.put("No_Of_Shares",5);
		obj1.put("Share_Price",155);
		list1.add(obj);
		list1.add(obj1);
		
		JSONObject obj2 = new JSONObject();
		obj2.put("Stock_Report",list1);
		System.out.println(list1);
		try (FileWriter file = new FileWriter("MyJson1.json")){
			file.write(obj2.toJSONString());
			//file.write(list1.toJSONString());
			file.flush();}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
