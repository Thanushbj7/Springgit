package com.testcases.demo;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.vfislk.training.Calculator;

class CalculatorTest {
	Calculator calculator;
	@BeforeAll
	public static void init() {
		System.out.println("called before all the testcases");
	}
	
	@BeforeEach
	public  void setUp() {
		calculator=new Calculator();
	}
	@Test
	public  void testAdd() {
		System.out.println("Testing.....");
		int actual=calculator.sum(10, 20);
		assertEquals(30,actual);
	}@Test
	public  void testproduct() {
		System.out.println("Testing.....");
		int actual=calculator.product(4, 2);
		assertEquals(8,actual);
	}
@AfterEach          
public  void teardown() {
	System.out.println("called before all the testcases");
}
@AfterAll
public static void cleanup() {
	System.out.println("called before all the testcases");
}
}
