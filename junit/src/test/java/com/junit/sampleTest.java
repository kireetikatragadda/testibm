package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class sampleTest {

	@Test
	void m1Test() {
		sample s = new sample();
		assertEquals("Welcome",s.m1());
	}

}
