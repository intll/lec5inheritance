package models;

public class Murid extends Persona{
	protected final String status;

	public Murid(String name, String address, String phoneNumber, String email, String status) {
		super(name, address, phoneNumber, email);
		this.status = validateStatus(status);
	}

	@Override
	public String toString() {
		return "Class name: Murid | Name: " + this.name;
	}
	
	public String validateStatus(String s) {
		if (s.equals("Junior") || s.equals("Freshman") || s.equals("Sophomore") || s.equals("Senior"))
			return s;
		else
			return "Unknown";
	}

	public String getStatus() {
		return status;
	}
	
}
