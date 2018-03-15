package cooksys.treemap;

import java.util.Scanner;

public class ScanForInput {
	public PatientInformation scanPatientInformation() {
		Scanner s = new Scanner(System.in);
		
		String name, address, allergies;
		System.out.println("Enter in your name: ");
		name = s.nextLine();
		System.out.println("Enter in street address: ");
		address = s.nextLine();
		System.out.println("Enter in allergies: ");
		allergies = s.nextLine();
		
		PatientInformation patient = new PatientInformation(name, address, allergies);
		
		System.out.println(patient);
		
		return patient;
	}
}
