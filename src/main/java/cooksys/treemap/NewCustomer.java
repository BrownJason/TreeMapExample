package cooksys.treemap;

import java.util.Map;
import java.util.TreeMap;

public class NewCustomer {
	
	public static void main(String[] args) {
		System.out.println("------TreeMap using two Object types------");
		System.out.println();
		//Initialization of the TreeMap
		/**
		 * Using HashMap if you want to use a Key, Value Collection type and want that collection
		 * sorted by its Keys - 
		 * ----------(Key,    Value)-----------------------
		 * Hospitals(Room#, Patient Information(Name, Address, Past History, current condition, etc.))
		 * Schools(Student ID, Student Information(Name, Address, etc.))
		 * 
		 * 
		 */
		TreeMap<Integer, PatientInformation> tree = new TreeMap<Integer, PatientInformation>();
		
		/**
		 * 
		 */
		boolean exit = false;
		int id = 1000000;
		do {
			//Calls the ScanForInput class to get patient information
			ScanForInput sci = new ScanForInput();
			//Creates an instance of PatientInforamtion that uses the ScanForInput class to get the 
			//User information to store into the PatientInformation class for callback
			PatientInformation zero =  sci.scanPatientInformation();
			
			//If any of the values entered are equal to exit, it will break out of the loop and display all 
			//past entries of the map
			if(zero.getAddress().equals(new String("exit")) || zero.getAllergies().equals(new String("exit")) || zero.getName().equals(new String("exit"))){
				exit = true;
				break;
			}
			
			//Add a new Map element to the tree with the Key of id (Integer) and Value of PatientInformation
			tree.put(id, zero);
			//Increase id to remove duplicates from the map element creation
			id++;
			System.out.println("Patient: " + id + ": " + zero);
		} while(!exit);
		
		//Display all Map entries in a sorted view and prints it to the console
		for(Map.Entry<Integer, PatientInformation> zero1 : tree.entrySet()) {
			System.out.println("Patient: " + zero1.getKey() + ": " + zero1.getValue());
		}
	}
}
