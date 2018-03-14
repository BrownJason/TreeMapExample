package cooksys.treemap;

public class PatientInformation {
	private String name;
	private String address;
	private String allergies;
	
	public PatientInformation(String name, String address, String allergies) {
		this.name = name;
		this.address = address;
		this.allergies = allergies;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAllergies() {
		return allergies;
	}
	
	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}

	public String toString() {
		return "Info: " + this.name + " --- Address: " + this.address + " --- Allergies: " + this.allergies;
	}
}
