package com.mile1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mile1.bean.Student;
import com.mile1.service.StudentReport;

public class TestCase2 {
		@Test
		public void tc2() {
			assertEquals("C",StudentReport.findGrades(new Student("sabari",new int[] {90,50})));
		}
}

