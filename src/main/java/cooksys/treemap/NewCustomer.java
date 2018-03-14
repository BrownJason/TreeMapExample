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
		 * My Examples isn't completely needed for bank accounts
		 * 
		 */
		TreeMap<String, Double> tree = new TreeMap<String, Double>();
		
		//Creating new instances of customers - Can be done with a form or scan line
		//Adds the customers to the tree with the Key of their account, and value of their
		tree.put("Jason", 34000.0);
		tree.put("Nate", 37000.0);
		tree.put("Hamilton", 45000.0);
		
		//Displays the tree elements after the initial sort of the tree
		for(Map.Entry<String, Double> customers : tree.entrySet()) {
			System.out.println(customers.getKey() + " current balance: " + customers.getValue());
		}
		
		System.out.println();
		
		//Make a change to one of the customers
		double newBalance = ((Double)tree.get("Jason")).doubleValue();
		tree.put("Jason", new Double(newBalance + 6000));
		
		System.out.println("After change to **Jason's** account.");
		System.out.println();
		
		//Display the tree elements again after a change has occurred
		for(Map.Entry<String, Double> customers : tree.entrySet()){
			System.out.println(customers.getKey() + " current balance: " + customers.getValue());
		}
		
		System.out.println();
		System.out.println("------TreeMap using another class as the value------");
		System.out.println();
		
		//This is same as above but with using another class and storing that class within a tree map
		TreeMap<Integer, PatientInformation> newTree = new TreeMap<Integer, PatientInformation>();
		
		newTree.put(100001, new PatientInformation("Jason", "33425 This Street, MI", "None"));
		newTree.put(100002, new PatientInformation("Nate", "8393 Santa Fe, NM", "Bees"));
		newTree.put(100003, new PatientInformation("Hamilton", "Tennesse", "Puppies"));

		for(Map.Entry<Integer, PatientInformation> newCustomers : newTree.entrySet()) {
			System.out.println("Patient: " + newCustomers.getKey() + ": " + newCustomers.getValue());
		}
		
		//lets make a change to the bank account of someone else
		String newAddress = ((String)newTree.get(100002).getAddress());
		newTree.put(100002, new PatientInformation("Nate", newAddress.replaceAll(newAddress, "New Mexico"), "Bees"));
		
		System.out.println();
		System.out.println("Change's to **Nates** bank account");
		System.out.println();

		for(Map.Entry<Integer, PatientInformation> newCustomers : newTree.entrySet()) {
			System.out.println("Patient: " + newCustomers.getKey() + ": " + newCustomers.getValue());
		}
	}
}
