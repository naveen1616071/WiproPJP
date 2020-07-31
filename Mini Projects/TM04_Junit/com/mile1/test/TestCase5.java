package com.mile1.test;

import org.junit.Test;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;
import com.mile1.service.StudentReport;

public class TestCase5 {
	@Test(expected=NullNameException.class)
	public void tc5() throws NullNameException, NullMarksArrayException, NullStudentException  {		
		StudentReport.validate(new Student(null,new int[] {1,2}));
		
	}
}
