package com.mile1.service;
import com.mile1.exception.*;

import java.util.Objects;

import com.mile1.bean.*;
public class StudentReport {

	public String findGrades(Student studentObjects) {
		int arr[]=studentObjects.getMarks().clone();
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<35) {
				return "Grade is \"F\"";
			}
			else {
				sum=sum+arr[i];
			}
		}
		if(sum<150)
			return "Grade is \"C\"";
		else if(sum<200)
			return "Grade is \"B\"";
		else if(sum<250)
			return "Grade is \"A\"";
		else
			return "Grade is \"A+\"";
		
	}
	public String validate(Student s) throws NullStudentObjectException ,NullNameException, NullMarksArrayException{
		try {
			if (Objects.isNull(s)) {
				throw new NullStudentObjectException();
			} else if (Objects.isNull(s.getName())) {
				throw new NullNameException();
			} else if (Objects.isNull(s.getMarks())) {
				throw new NullMarksArrayException();
			} else {
				return "valid";
			}
		} catch (NullStudentObjectException ae) {
			//System.out.println(ae);
			ae.printStackTrace();
			return "";
		} catch (NullNameException ne) {
			//System.out.println(ne);
			ne.printStackTrace();
			return "";
		} catch (NullMarksArrayException oe) {
			//System.out.println(oe);
			oe.printStackTrace();
			return "";
		}
	
	}
}
