package com.mile1.test;
import static org.junit.Assert.assertEquals;

import com.mile1.exception.*;
import org.junit.Test;

import com.mile1.bean.Student;
import com.mile1.service.StudentReport;

public class TestCase4  {
	@Test(expected=NullStudentException.class)
	public void tc4() throws NullNameException, NullMarksArrayException, NullStudentException  {		
		StudentReport.validate(null);
		
	}

	
}
