package com.bridgeLabz.ObjectOriented;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

public class CliniqueRepository {

public static void writeData(String filePath,JSONArray jsonArray) {
	try(FileWriter fileWriter = new FileWriter(filePath)){
		fileWriter.write(jsonArray.toJSONString());
		
	} catch (IOException e) {
		e.printStackTrace();
	}
}

public static JSONArray readData(String filePath) throws org.json.simple.parser.ParseException {
	JSONArray jsonArray;
	try(FileReader fileReader = new FileReader(filePath)){
		JSONParser jsonParser = new JSONParser();
		jsonArray = (JSONArray) jsonParser.parse(fileReader);
		return jsonArray;
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} 
	return null;
}
}
