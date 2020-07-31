package com.wipro.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestCheckPresence {
	@Test
	public void testChechPresence() {

		assertTrue(DailyTasks.checkPresence("stringabc", "abc"));
		assertFalse(DailyTasks.checkPresence("string", "abc"));

	}
}
