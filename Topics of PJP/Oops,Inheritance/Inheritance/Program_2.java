package Inheritance;

class Person {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class Employee extends Person {
	double Annualsalary;
	int startingyear;
	String insuranceNumber;

	public double getAnnualsalary() {
		return Annualsalary;
	}

	public void setAnnualsalary(double Annualsalary) {
		this.Annualsalary = Annualsalary;
	}

	public int getstartingyear() {
		return startingyear;
	}

	public void setstartingyear(int startingyear) {
		this.startingyear = startingyear;
	}

	public String getinsuranceNumber() {
		return insuranceNumber;
	}

	public void setinsuranceNumber(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}
}

class Program_2 {
	public static void main(String args[]) {
		Employee emp = new Employee();
		emp.setName("Raja");
		emp.setAnnualsalary(110000);
		emp.setstartingyear(2001);
		emp.setinsuranceNumber("567895432490");
		System.out.println(
				emp.getName() + " " + emp.getAnnualsalary() + " " + emp.getstartingyear() + " " + emp.getinsuranceNumber());
	}
}
