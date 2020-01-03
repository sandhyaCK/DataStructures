package com.bridgeLabz.ObjectOriented;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.util.Iterator;
import java.util.function.Predicate;
import java.util.regex.Pattern;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.util.*;

public class Utility {
	static Scanner scanner = new Scanner(System.in);
	static Scanner sc = new Scanner(System.in);
	static Random random = new Random();
	static String inputString = "";
	static boolean flag = false;

	public static String getString(boolean details) {
		inputString = "";
		while (inputString.equals("")) {
			sc.reset();
			inputString = sc.nextLine();
			if (!details) {
				if (!Pattern.matches("\\D*[^\\s]", inputString)) {
					System.out.println("Please enter valid String");
					AddressBookController.addUser();
					inputString = "";
				}
			}
		}
		return inputString;
	}
	public static void WriteObjFile(File file,JSONObject Obj) {
	FileWriter filewriter=null;
	
	try 
	{
	filewriter = new FileWriter("MyJson1.json");
	filewriter.write(Obj.toJSONString());
	}
	catch(Exception e) 
	{
		e.printStackTrace();
	}
}
	public static void ReadObjFile(File file) 
	{
		 JSONParser parser = new JSONParser();		 
	try(Reader reader = new FileReader(file)){
	JSONObject object = (JSONObject) parser.parse(reader);
	}
	catch(Exception e) 
	{
		e.printStackTrace();
	}
	}
	public static void WriteArrayFile(File file,JSONArray jsonArray) {
		FileWriter filewriter=null;
		try 
		{
		filewriter = new FileWriter("MyJson1.json");
		filewriter.write(jsonArray.toJSONString());
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	public static JSONArray ReadArrayFile(File file) 
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
	@SuppressWarnings("unchecked")
	Iterator<Long> iterator = list.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}}
	 public static String inputString() {
		try {
			return scanner.next();
		} catch (Exception e) {
			System.out.println("Invalied Input");
		}
		return null;
	}
	 public static boolean checkStringOne(String userInput) {

			char ch[] = userInput.toCharArray();
			for (int i = 0; i < ch.length; i++) {
				if (ch[i] >= '0' && ch[i] <= '9') {
					return false;
				}
			}
			return true;
		}


	public static String inputStringLine() {
		try {
			return scanner.nextLine();
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
	public static boolean stringChecker(String str) {
		char[] ch = str.toCharArray();
		String temp = "";
		Predicate<Character> p = s -> s >= 97 && s <= 122 || s >= 65 && s <= 90 || s >= 48 && s <= 57;
		for (char i : ch) {
			if (p.test(i)) {
				return true;
			}
		}
		return false;
	}

	public static boolean intChecker(String number) {
		// regular expression for an integer number 
        String regex = "[+-]?[0-9][0-9]*"; 
        Pattern p = Pattern.compile(regex); 
        
     // Creates a matcher that will match input1 against regex 
        java.util.regex.Matcher m = p.matcher(number);
        
        if(m.find() && m.group().equals(number)) 
        	return true;
        
		return false;
		
	}
	 public static boolean isStringOnlyAlphabet(String str) 
	    { 
	        return ((str != null) 
	                && (!str.equals("")) 
	                && (str.matches("^[a-zA-Z]*$"))); 
	    }
	 public static void quit() {
			System.exit(0);
			
		}
	 public static String doctorId() {
		    String output = "";
		    String doctorId = "DOC";
		    for (int i = 0 ; i < 3 ; i++){
		        output+=random.nextInt(10);
		    }
		    int outputInt = Integer.parseInt(output);
		    return doctorId+=outputInt;
			
		}
		
		public static String patientId() {
		    String output = "";
		    String doctorId = "PAT";
		    for (int i = 0 ; i < 3 ; i++){
		        output+=random.nextInt(10);
		    }
		    int outputInt = Integer.parseInt(output);
		    return doctorId+=outputInt;
			
		}
	
		
////////
		public static int inputInteger() {
			try {
				return scanner.nextInt();
			} catch (Exception e) {
				System.out.println("Invalied Input");
			}
			return 0;
		}
		public static boolean mobileNumberValidator(String mobile) {
			// TODO Auto-generated method stub
			return false;
		}
		
}