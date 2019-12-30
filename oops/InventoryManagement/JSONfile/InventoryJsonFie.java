package com.bridgeLabz.ObjectOriented;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class InventoryJsonFie {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		JSONObject obj1 = new JSONObject();		
		JSONArray list1 = new JSONArray();
		obj1.put("weight_in_kg",50);
		obj1.put("price_per_kg" ,10);
		JSONObject obj11 = new JSONObject();
		obj11.put("weight_in_kg",100);
		obj11.put("price_per_kg" ,15);
		JSONObject obj12 = new JSONObject();
		obj12.put("weight_in_kg",75);
		obj12.put("price_per_kg" ,18);
		JSONArray list111 = new JSONArray();
		list111.add(obj1);
		list111.add(obj11);
		list111.add(obj12);
		JSONObject obj111 = new JSONObject();
		obj111.put("Rice",list111);
		JSONObject obj2 = new JSONObject();
		obj2.put("weight_in_kg",100);
		obj2.put("price_per_kg" ,20);
		JSONObject obj21 = new JSONObject();
		obj21.put("weight_in_kg",50);
		obj21.put("price_per_kg" ,22);
		JSONObject obj22 = new JSONObject();
		obj22.put("weight_in_kg",80);
		obj22.put("price_per_kg" ,25);
		JSONArray list222 = new JSONArray();
		list222.add(obj2);
		list222.add(obj21);
		list222.add(obj22);
		JSONObject obj222 = new JSONObject();
		obj222.put("Wheat",list222);
		JSONObject obj3 = new JSONObject();
		obj3.put("weight_in_kg",150);
		obj3.put("price_per_kg" ,30);
		JSONObject obj31 = new JSONObject();
		obj31.put("weight_in_kg",30);
		obj31.put("price_per_kg" ,28);
		JSONObject obj32 = new JSONObject();
		obj32.put("weight_in_kg",100);
		obj32.put("price_per_kg" ,32);
		JSONArray list333 = new JSONArray();
		list333.add(obj3);
		list333.add(obj31);
		list333.add(obj32);
		JSONObject obj333 = new JSONObject();
		obj333.put("Pulses", list333);
		JSONObject obj = new JSONObject();
		obj.put("Inventory",obj111);
		obj.put("Inventory",obj222);
		obj.put("Inventory",obj333);
		
		try (FileWriter file = new FileWriter("MyJson.json")){
	
		    file.write(obj.toJSONString());
			file.flush();
		
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
