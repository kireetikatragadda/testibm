package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalcTest {
	Calc c;
	@BeforeAll
	static void initall() {
		System.out.println("Test started");
		
	}
	
	@AfterAll
	static void destroyAll() {
		System.out.println("Test completed");
	}
	@BeforeEach
	void init() {
		c = new Calc();
	}
	@AfterEach
	void destroy() {
		System.out.println("Test Completed");
	}

	@Test
	void calcAvg() {
		Calc c=new Calc();
		assertEquals(15,c.avg(10,20),"Logic Error in method");
		System.out.println("avg test done");
	}
	@Test
	void calcAdd() {
		Calc c=new Calc();
		assertEquals(c.expectedAdd,c.avg(10,20),"Add Logic Error in method");
	}
	
	

}
