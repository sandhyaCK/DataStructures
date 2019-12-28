/********************************************************************************************************************************************
 * Purpose 
 */
package com.bridgeLabz.ObjectOriented;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import com.bridgeLabz.ObjectOriented.*;
public class Stock_Reprt {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException, ParseException {
		JSONParser JsonParser = new JSONParser();
		try(FileReader reader = new FileReader("MyJson1.json")){
		JSONObject obj2 = (JSONObject) JsonParser.parse(reader);
		//JSONArray list1 =(JSONArray) JsonParser.parse(reader);
			System.out.println(obj2);
			JSONArray list1 = (JSONArray) obj2.get("Stock_Report");
			Utility.GetData(list1);
		int len = list1.size();
		for(int i=0;i<len;i++) {
			
		}					
		}			
		catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
		}
	//public static void StockRepoDetails(JSONObject STOCK) {
	//	JSONObject obj2 = 
	//}
	}


