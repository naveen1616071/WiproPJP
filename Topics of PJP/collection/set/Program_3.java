package set;

import java.util.Iterator;
import java.util.TreeSet;

class Employee implements Comparable<Employee> {
	int id;
	String name;
	int salary;

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee user) {
		return 1;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

public class Program_3 {
	TreeSet<Employee> v = new TreeSet<Employee>();

	public void addEmployee(Employee emp) {
		v.add(emp);
	}

	public void displayAllEmployee() {
		Iterator<Employee> i = v.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "sab", 25000);
		Employee emp2 = new Employee(102, "nisha", 30000);
		Employee emp3 = new Employee(103, "venki", 400000);
		Employee emp4 = new Employee(104, "madhan", 50000);
		Program_3 ref = new Program_3();
		ref.addEmployee(emp1);
		ref.addEmployee(emp2);
		ref.addEmployee(emp3);
		ref.addEmployee(emp4);

		ref.displayAllEmployee();

	}

}