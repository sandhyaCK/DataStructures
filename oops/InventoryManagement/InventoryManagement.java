package com.bridgeLabz.ObjectOriented;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class InventoryManagement {
	public static void main(String[] args) throws IOException, ParseException  {
		 JSONParser parser = new JSONParser();	 
	try(Reader reader = new FileReader("MyJson.json")){
	JSONArray list111 = (JSONArray) parser.parse(reader);	
    Iterator<Long> iterator = list111.iterator();
    while ( (iterator).hasNext()) {
         System.out.println(iterator.next());
         }        
    long totalweight =0;
    long price_per_kg=0; 
    
    for(int n=0;n<list111.size();n++) {
	      JSONObject obj = (JSONObject) list111.get(n);
		  if(obj.containsKey("weight_in_kg")) {		
          totalweight += (long) obj.get("weight_in_kg") ;
         }
      	if(obj.containsKey("price_per_kg")) {
		     (price_per_kg) +=(long) obj.get("price_per_kg");}
           }
	  System.out.println( "total weight " +" " +totalweight);
	 long  totalprice= (totalweight*price_per_kg);
         
     System.out.println( "total price " +" " + totalprice);
         
	}
	
	catch(Exception e) {
		e.printStackTrace();
	}

	}
	
		 

			}
			

			
	

	