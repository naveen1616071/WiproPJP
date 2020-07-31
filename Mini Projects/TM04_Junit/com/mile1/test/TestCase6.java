package com.mile1.test;

import org.junit.Test;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;
import com.mile1.service.StudentReport;

public class TestCase6 {
	@Test(expected=NullMarksArrayException.class)
	public void tc6() throws NullNameException, NullMarksArrayException, NullStudentException  {		
		StudentReport.validate(new Student("sabari",null));
		
	}
}
