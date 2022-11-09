package models;

import java.util.Date;

public class Pegawai extends Persona{
	protected String office;
	protected String salary;
	protected Date dateRecruited;
	
	public Pegawai(String name, String address, String phoneNumber, String email, String office, String salary,
			Date dateRecruited) {
		super(name, address, phoneNumber, email);
		this.office = office;
		this.salary = salary;
		this.dateRecruited = dateRecruited;
	}

	public String getOffice() {
		return office;
	}


	public void setOffice(String office) {
		this.office = office;
	}


	public String getSalary() {
		return salary;
	}


	public void setSalary(String salary) {
		this.salary = salary;
	}


	public Date getDateRecruited() {
		return dateRecruited;
	}


	public void setDateRecruited(Date dateRecruited) {
		this.dateRecruited = dateRecruited;
	}
	
}
