import java.util.*;
class Employee implements Cloneable{
	 public Object clone() throws CloneNotSupportedException 
     
{ 
return super.clone(); 
} 
	int Eno;
	String Ename;
	String Dob;
	int salary;
	void display() {
		System.out.println("Employee number "+Eno);
		System.out.println("Name of Employee "+Ename);
		System.out.println("Date of Birth "+Dob);
		System.out.println("Salary "+salary);
		
	}
	
}
public class Program_4 {

	public static void main(String[] args) throws CloneNotSupportedException 
    {
		Employee e1=new Employee();
		Employee e2 = (Employee)e1.clone(); 
		e1.Ename="Ruban";
		e1.Eno=1908259;
		e1.Dob="15.1.1999";
        e1.salary=50000;
        e2.Ename="Dinesh";
		e2.Eno=1908224;
		e2.Dob="1.10.1998";
        e2.salary=60000;
        e1.display();
        System.out.println();
        e2.display();

	}

}