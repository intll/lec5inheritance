package models;

import java.util.Date;

public class Dosen extends Pegawai{
	
	protected Integer officeHours;
	protected String jabatanAkademik;
	
	public Dosen(String name, String address, String phoneNumber, String email, String office, String salary,
			Date dateRecruited) {
		super(name, address, phoneNumber, email, office, salary, dateRecruited);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Class Name: Dosen | Name: " + this.name;
	}

	public Integer getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(Integer officeHours) {
		this.officeHours = officeHours;
	}

	public String getJabatanAkademik() {
		return jabatanAkademik;
	}

	public void setJabatanAkademik(String jabatanAkademik) {
		this.jabatanAkademik = jabatanAkademik;
	}
	
	
	
}
