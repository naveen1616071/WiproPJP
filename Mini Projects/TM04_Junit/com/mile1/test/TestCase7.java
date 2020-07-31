package com.mile1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mile1.bean.Student;
import com.mile1.service.StudentService;


public class TestCase7 {
	@Test
	public void tc7() {
		Student data[]=new Student[4];
		for(int i=0;i<data.length;i++) {		
			data[i]=new Student();
		}
		data[0]=new Student("Sekar",new int[] {85,75,95});
		data[1]=new Student(null,new int[] {11,22,23});
		data[2]=null;
		data[3]=new Student("Manoj",null);
		assertEquals(1,StudentService.findNumberOfNullName(data));
	}
}
