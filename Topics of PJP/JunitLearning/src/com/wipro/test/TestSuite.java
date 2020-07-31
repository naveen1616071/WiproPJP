package com.wipro.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestSuite {
	@Test
	public void testSuite() {
		assertEquals("Stringabcabc", DailyTasks.doStringConcat("String", "abcabc"));
		assertArrayEquals(new int[] { 1, 2, 3, 4 }, DailyTasks.sortValues(new int[] { 3, 2, 4, 1 }));
		assertTrue(DailyTasks.checkPresence("stringabc", "abc"));
		assertFalse(DailyTasks.checkPresence("string", "abc"));
	}
}
