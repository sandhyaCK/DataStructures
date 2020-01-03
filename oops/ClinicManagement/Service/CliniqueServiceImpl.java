package com.bridgeLabz.ObjectOriented;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import com.bridgeLabz.ObjectOriented.*;

public class CliniqueServiceImpl implements CliniqueService {
	JSONArray jsonArray = new JSONArray();
	JSONObject jsonObject = new JSONObject();

	static String doctor = "JsonFile/doctor.json";
	static String patient = "JsonFile/patient.json";
	static String appointment = "JsonFile/appointment.json";

	@SuppressWarnings("unchecked")
	@Override
	public void doctorDetails() {

		try {
			jsonArray = CliniqueRepository.readData(doctor);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		DoctorDetails doctorDetails = new DoctorDetails();
		System.out.println("Enter Doctor Name");
		String doctorName = Utility.inputString();
		if (Utility.isStringOnlyAlphabet(doctorName)) {
			doctorDetails.setDoctorName(doctorName);
		}

		System.out.println("Enter Doctor Specialization");
		String specialization = Utility.inputString();
		if (Utility.isStringOnlyAlphabet(specialization)) {
			doctorDetails.setSpecialization(specialization);
		}

		System.out.println("Enter Doctor Availability");
		String availability = Utility.inputString();
		if (Utility.isStringOnlyAlphabet(availability)) {
			doctorDetails.setAvailability(availability);
		}

		doctorDetails.setDoctorId(Utility.doctorId());
		doctorDetails.setNumberOfPatients(0);

		jsonObject.put("Id", doctorDetails.getDoctorId());
		jsonObject.put("Name", doctorDetails.getDoctorName());
		jsonObject.put("Specialization", doctorDetails.getSpecialization());
		jsonObject.put("Availability", doctorDetails.getAvailability());
		jsonObject.put("Patients", doctorDetails.getNumberOfPatients());

		jsonArray.add(jsonObject);

		System.out.println(jsonArray);
		CliniqueRepository.writeData(doctor, jsonArray);

	}

@Override
	/** Reads doctor's data from json file **/
	@SuppressWarnings("rawtypes")
	public void readDoctorData(String key, String value,String choice) {
			jsonArray = (JSONArray) CliniqueRepository.readData(doctor);
			Iterator iterator = (Iterator) jsonArray.iterator();
			JSONObject jsonObject, lastJasonObject = null;
			
			//	iterates over json array
			while (iterator.hasnext()) {
				//	checks if data given by user matches with any json object
				//	and if present prints it
				if ((jsonObject = (JSONObject) iterator.next()).get(key).equals(value)) {
					lastJasonObject = jsonObject;
					System.out.println("\nDoctor Information:");
					System.out.println("ID: " + jsonObject.get("Id") + "\t");
					System.out.println("Name: " + jsonObject.get("Name") + "\t");
					System.out.println("Specialization: " + jsonObject.get("Specialization") + "\t");
					System.out.println("Availability: " + jsonObject.get("Availability") + "\t");
					System.out.println("Number of Patients: " + jsonObject.get("Patients") + "\n");
					
					//asks user if want to take an appointment
					System.out.println("Do you want to take an appointment?[y/n]");
					String response = Utility.inputString().toLowerCase();
					if (response.equals("y")) {
						makeAppointment(lastJasonObject);
					}
					else {
						CliniqueController.menu();
					}
				}
			}
			System.out.println("Enter valid Doctor "+key);
			CliniqueController.doctorChoice(choice);
	}
@SuppressWarnings({ "unchecked", "unused" })
	private void makeAppointment(JSONObject doctorJsonObject) throws ParseException {
		String patientId = "";
		String doctorId = (String) doctorJsonObject.get("Id");
		long patients = (long) doctorJsonObject.get("Patients");
		if (patients >= 5) { // doctor is busy
			System.out.println("Sorry!!! Doctor is busy today. Do you want to take an appointment tomorrow[y/n]");
			//current date
		      LocalDate today = LocalDate.now();
			  
			//adding one day to the localdate
			LocalDate tomorrow = today.plusDays(1);
			DateTimeFormatter format =  DateTimeFormatter.ofPattern("dd-MM-yyyy");   
		    
		    String date = tomorrow.format(format); 
			  
			//System.out.println("Tomorrow's Date: "+dateTime);
			String response = Utility.inputString().toString();
			if(response.equals("y")) {
				int count = 0;
				JSONArray jsonArray = CliniqueRepository.readData(appointment);
				JSONObject jsonObject = new JSONObject();
				patientId = Utility.patientId(); 
				jsonObject.put("DoctorId", doctorId);
				jsonObject.put("PatientId", patientId);
				jsonObject.put("AppointmentDate", date);
				//jsonObject.put("Total Patient", count++);
				
				jsonArray.add(jsonObject);
				
				CliniqueRepository.writeData(appointment, jsonArray);
				System.out.println("Congratulation You got an appointment on "+date+". Your Patient ID is " + patientId + "\n");
				CliniqueController.menu();
			}
			else {
				CliniqueController.menu();
			}
			
			
		} 
		// doctor is not busy. Increases number of patients and updates json file
		else { 
			patientId = Utility.patientId(); 
			// updates patient json file
			patientDetailsNew(patientId,doctorId);
			doctorJsonObject.put("Patients", patients+1);
			updateDoctorData(doctorJsonObject);
			System.out.println("Congratulation You got an appointment. Your Patient ID is " + patientId + "\n");
			CliniqueController.menu();
		}

	}
//@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void updateDoctorData(JSONObject doctorJsonObject) {

		jsonArray = CliniqueRepository.readData(doctor);

		JSONArray updatedArray = new JSONArray(); // new array with updated elements
		Iterator iterator = (Iterator) jsonArray.iterator();

		// iterates over array
		while ( iterator.hasnext()) {
			JSONObject object = iterator.next();
			if (object.get("Id").equals(doctorJsonObject.get("Id"))) {
				updatedArray.add(doctorJsonObject);
			} else {
				updatedArray.add(object);
			}
		}

		CliniqueRepository.writeData(doctor, updatedArray);

	}

	@SuppressWarnings("unchecked")
	public void patientDetailsNew(String id, String doctorId) throws ParseException {

		JSONArray jsonArray = CliniqueRepository.readData(patient);

		PatientDetails patientDetails = new PatientDetails();
		System.out.println("Enter Patient Name");
		String patientName = Utility.inputString();
		if (Utility.isStringOnlyAlphabet(patientName)) {
			patientDetails.setPatientName(patientName);
		}

		System.out.println("Enter Mobile Number");
		String mobile = Utility.inputString();
		if (Utility.mobileNumberValidator(mobile)) {
			System.out.println("Mobile :" + mobile);
			patientDetails.setMobile(Long.parseLong(mobile));
		}

		System.out.println("Enter Age");
		int age = Utility.inputInteger();
		patientDetails.setAge(age);

		patientDetails.setId(Utility.patientId());

		jsonObject.put("Id", patientDetails.getId());
		jsonObject.put("Name", patientDetails.getPatientName());
		jsonObject.put("Mobile", patientDetails.getMobile());
		jsonObject.put("Age", patientDetails.getAge());
		jsonObject.put("Doctor Id",doctorId);

		jsonArray.add(jsonObject);
		//System.out.println(jsonArray);
		CliniqueRepository.writeData(patient, jsonArray);
	}
	@Override
	@SuppressWarnings("rawtypes")
	public void readPatientData(String key, String value) {
		try {
			jsonArray = CliniqueRepository.readData(patient);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		java.util.Iterator iterator = jsonArray.iterator();
		JSONObject jsonObject;
		while ((boolean) iterator.next()) {
			if ((jsonObject = (JSONObject) iterator.next()).containsValue(value)) {
				System.out.println("\nPatient Information:");
				System.out.println("ID: " + jsonObject.get("Id") + "\t");
				System.out.println("Name: " + jsonObject.get("Name") + "\t");
				System.out.println("Mobile Number: " + jsonObject.get("Mobile") + "\t");
				System.out.println("Age: " + jsonObject.get("Age") + "\n");
			}
		}
		CliniqueController.menu();
	}
}
