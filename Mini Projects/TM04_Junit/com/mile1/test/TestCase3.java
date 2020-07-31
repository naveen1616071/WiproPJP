package com.mile1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mile1.bean.Student;
import com.mile1.service.StudentReport;

public class TestCase3 {
		@Test
		public void tc3() {
			assertEquals("F",StudentReport.findGrades(new Student("sabari",new int[] {90,80,31})));
		}
}
