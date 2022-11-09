package models;

import java.util.Date;

public class Staff extends Pegawai{

	public Staff(String name, String address, String phoneNumber, String email, String office, String salary,
			Date dateRecruited) {
		super(name, address, phoneNumber, email, office, salary, dateRecruited);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Class Name: Staff | Name: " + name;
	}

}
