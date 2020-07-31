package com.mile1.service;
import java.util.Objects;

import com.mile1.bean.*;
public class StudentService {
	
	public static int findNumberOfNullMarks(Student s[]) {
		int count=0;
		for(int i=0;i<s.length;i++) {
			if (Objects.nonNull(s[i])&&s[i].getMarks()==null) {
				count++;
			}
		}
		return count;
	}
	public static int findNumberOfNullName(Student s[]) {
		int count=0;
		for(int i=0;i<s.length;i++) {
			if (Objects.nonNull(s[i])&&s[i].getName()==null) {
				count++;
			}
		}
		return count;
	}
	public static int findNumberOfNullObjects(Student s[]) {
		int count=0;
		for(int i=0;i<s.length;i++) {
			if (Objects.isNull(s[i])) {
				count++;
			}
		}
		return count;
	}

}
