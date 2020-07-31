package com.mile1.main;
import com.mile1.bean.*;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.*;
public class StudentMain {
	static Student data[]=new Student[4];
	
	public StudentMain() {
		for(int i=0;i<data.length;i++) {		
			data[i]=new Student();
		}
		data[0]=new Student("Sekar",new int[] {85,75,95});
		data[1]=new Student(null,new int[] {11,22,23});
		data[2]=null;
		data[3]=new Student("Manoj",null);
		
	}

	public static void main(String[] args) throws NullStudentObjectException, NullNameException, NullMarksArrayException {
		StudentMain sm=new StudentMain();
		
		for (int i = 0; i < data.length; i++) {
			StudentReport s = new StudentReport();
			String str = s.validate(data[i]);
			System.out.println(str);
			if (str.equals("valid")) {
				System.out.println(s.findGrades(data[i]));
			}
			}
		
			StudentService s = new StudentService();
			
			int obj=s.findNumberOfNullObjects(data);
			System.out.println("NumberOfNullObjects : "+obj);
			
			
			int name=s.findNumberOfNullName(data);
			System.out.println("NumberOfNullName : "+name);
			
			int array=s.findNumberOfNullMarksArray(data);
			System.out.println("NumberOfNullMarksArray : "+array);
			
		
	}

}
