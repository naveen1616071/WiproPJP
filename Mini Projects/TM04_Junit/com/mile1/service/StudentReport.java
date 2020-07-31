package com.mile1.service;
import com.mile1.exception.*;

import java.util.Objects;

import com.mile1.bean.*;
public class StudentReport {

	public static String findGrades(Student studentObjects) {
		int arr[]=studentObjects.getMarks().clone();
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<35) {
				return "F";
			}
			else {
				sum=sum+arr[i];
			}
		}
		if(sum<150)
			return "C";
		else if(sum<200)
			return "B";
		else if(sum<250)
			return "A";
		else
			return "A+";
		
	}
	public static Exception validate(Student s) throws NullStudentException ,NullNameException, NullMarksArrayException{
	
			if (Objects.isNull(s)) {
				throw new NullStudentException();
			} else if (Objects.isNull(s.getName())) {
				throw new NullNameException();
			} else if (Objects.isNull(s.getMarks())) {
				throw new NullMarksArrayException();
			} else {
				return null;
			}
		
	
	}
}
