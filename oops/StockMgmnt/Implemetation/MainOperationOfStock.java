package com.bridgeLabz.ObjectOriented;

import java.io.File;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgeLabz.ObjectOriented.*;

public class MainOperationOfStock implements StockOperation{
String path =  "/home/user/datastruct/oops/StockMgmnt/Stock_Json.json"; 
File fileRead = new File(path);
String Path1 = "/home/user/datastruct/oops/StockMgmnt" ;
File f1 = new File(Path1);
@SuppressWarnings("unchecked")
Stack<String> stack= new Stack();
//Queue<String> queue=new Queue();
StockDetails[] companyShare;
public MainOperationOfStock() {
	stack= new  Stack<>();
//	queue= new Queue<>();
}
@SuppressWarnings("unchecked")
@Override
public void AddDetails(File file, StockDetails StockDetails) {
@SuppressWarnings("unused")
JSONObject object =new JSONObject(); 
JSONObject obj=Stock_Utility.ReadObjFile(fileRead);
JSONObject	obj1 = (JSONObject)obj.get("Stock_Report");
JSONArray Array = new JSONArray();
obj1.put("companyName",StockDetails.getCompanyName());
obj1.put("NumberOfShare",StockDetails.getNumberOfShare());
obj1.put("price",StockDetails.getPrice());
	Array.add(obj1);
	obj1.put("companySymbol",Array);
Stock_Utility.WriteObjFile(file, obj1);

	System.out.println(file);
	System.out.println("Successfully Added");
	
}
@SuppressWarnings("unchecked")
@Override
public void RemoveDetails(String companySymbol) {
	@SuppressWarnings("unused")
	JSONObject jsonobj = new JSONObject();
	JSONObject obj1 =Stock_Utility.ReadObjFile(fileRead);
	JSONObject obj2 = (JSONObject)obj1.get("Stock_Report");
	if(obj2.containsKey("companySymbol")) {
		obj1.remove("companySymbol");
		obj2.put("Stock_Report",obj1);
		Stock_Utility.WriteObjFile(fileRead, obj2);
		System.out.println("Successfully deleted");
	}
	else {
		System.out.println("Not Found");
	}
	
}

public JSONArray UpdateCompanyDetails(JSONArray jsonArray, int numberOfShare, double price) {
	long updatedShare = 0;
	Iterator<?> iterator = jsonArray.iterator();
	while (iterator.hasNext()) {
		JSONObject type = (JSONObject) iterator.next();
		updatedShare = (long) type.get("NumberOfShare");
		System.out.println("updated share " + updatedShare);
		if (numberOfShare > updatedShare) {
			System.out.println("Number of Share should be less than total share which is :" + updatedShare);
		} else {
			updatedShare = (updatedShare - numberOfShare);
			type.put("NumberOfShare", updatedShare);
			type.put("Price",(double) price *updatedShare);
		}
	}
	return jsonArray;
	
}

	@SuppressWarnings("unchecked")
	@Override
	public void BuyShare(Double amount, String Symbol, File Filewrite) {
		int count = 0;
		double price = 0;
		JSONArray array, jsonArray = null;

		JSONObject jsonObject = Stock_Utility.ReadObjFile(fileRead);
		JSONObject json = (JSONObject) jsonObject.get("Stock_Report");
		System.out.println(json);
		long Nshare = 0;
		if ((array = (JSONArray) json.get("companySymbol")) != null) {
			jsonArray = array;
			Iterator<?> iterator = array.iterator();
			while (iterator.hasNext()) {
				JSONObject cDetails = (JSONObject) iterator.next();
				Nshare = (long) cDetails.get("NumberOfShare");
				price = (double) cDetails.get("Price");
			}
			price  = price / Nshare;
			System.out.println(amount/price);
			int numberOfShare = (int) Math.round(amount/price);
			System.out.println("Share :" + numberOfShare);

			array = UpdateCompanyDetails(jsonArray, numberOfShare , price);		
			JSONObject accountObject = new JSONObject();
			accountObject.put("Symbol", "companySymbol");
			accountObject.put("PurchaseShare", numberOfShare);
			
			accountObject.put("Price", price);

			JSONArray array2 = new JSONArray();
			array2.add(accountObject);

			Stock_Utility.WriteObjFile(fileRead, jsonObject);
			Stock_Utility.WriteArrayFile(fileRead, array2);
			//Stack.push("Purchased");
			
		} else {
			System.out.println("The Stock you are trying to purchase is not available in Stock Market");
		}
	}

	
	
	@Override
	public void SellShare(Double amount, String Symbol, File f1) {
		double price = 0;
		JSONObject jsonObject, accountJson = null;
		JSONArray jsonArray = Stock_Utility.ReadArrayFile(f1);
		if(jsonArray.size()!=0) {
		Iterator<?> iterator = jsonArray.iterator();
		while(iterator.hasNext()) {
		if((jsonObject=(JSONObject) iterator.next()).get("Symbol").equals( Symbol)	) {
			if(jsonObject.get("PurchaseShare")!=null) {
				accountJson = jsonObject;
				price = (double) jsonObject.get("price");
			}
		}
		}
		int numberOfShare = (int) Math.round(price / amount);
		System.out.println("Share :" + numberOfShare);
		}
	}

	
	
	@Override
	public void printCompanyDetails() {
	String path = "/home/user/datastruct/oops/StockMgmnt/Stock_Json.json"; 	
	File file = new File(path);
	JSONObject obj = Stock_Utility.ReadObjFile(file);
	JSONObject json =( JSONObject) obj.get("Stock_Report");
	JSONArray obj1 = new JSONArray();
	Object[] keys = json.keySet().toArray();
	for(Object i: keys) {
		JSONArray a = (JSONArray) json.get(i);
		for (Object j : a) {
			JSONObject m = (JSONObject) j;
			System.out.println("CompanyName   :" + m.get("CompanyName"));
			System.out.println("NumberOfShare :" + m.get("NumberOfShare"));
			System.out.println("Price         :" + m.get("Price"));
			System.out.println("CompanySymbol :" + m.get("CompanySymbol"));
			System.out.println();
	}
	}
	
	}
	
}
