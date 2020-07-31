package com.wipro.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestSort {
	@Test
	public void testsort() {
		assertArrayEquals(new int[] { 1, 2, 3, 4 }, DailyTasks.sortValues(new int[] { 3, 2, 4, 1 }));
	}
}
