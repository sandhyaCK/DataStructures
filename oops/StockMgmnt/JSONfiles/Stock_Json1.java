package com.bridgeLabz.ObjectOriented;
import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.util.*;

public class Stock_Json1 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    JSONObject obj = new JSONObject();
		JSONArray list1 = new JSONArray();
		obj.put("Sold_Share",14);
		obj.put("price",453);
		obj.put("PurchaseShare",15);
		obj.put("Symbol","R");
		
	list1.add(obj);
	System.out.println(list1);
	}
}
