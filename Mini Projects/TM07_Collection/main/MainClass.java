package com.wipro.main;
import com.wipro.bean.EmployeeBean;
import com.wipro.service.*;

public class MainClass {

	public static void main(String[] args) {
		EmployeeBean e1=new EmployeeBean(101,"sab",25000f,"TL");
		EmployeeBean e2=new EmployeeBean(102,"nisha",30000f,"PM");
		EmployeeBean e3=new EmployeeBean(103,"venki",400000f,"CEO");
		EmployeeBean e4=new EmployeeBean(104,"madhan",50000f,"GM");
		EmployeeService es=new EmployeeService();
		es.insertEmployee(e1);
		es.insertEmployee(e2);
		es.insertEmployee(e3);
		es.insertEmployee(e4);
		System.out.println(es.insertEmployeeByPosition(new EmployeeBean(106,"ram",5002f,"gl"), 2));
		System.out.println(es.updateEmployeeByEmpID(new EmployeeBean(102,"naveen",1000000f,"CEO")));
		System.out.println(es.fetchAllEmployees());
	}

}
