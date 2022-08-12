package com.testcases.demo;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.vfislk.exception.InvalidNumException;
import com.vfislk.exception.NegValueException;
import com.vfislk.training.Student;

class StudentTest {
Student student;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		student=new Student();
	}

	@AfterEach
	void tearDown() throws Exception {
		Student student=null;
	}

	@Test
	void testCalcTotal() throws NegValueException, InvalidNumException {
		
		assertEquals(80,student.calcTotal(20, 20,40));

	}
	@Test 
	void testNegTotal() {
		assertThrows(NegValueException.class,()->student.calcTotal(-90,80,60));
			}
	@Test 
	void testGreaterTotal() {
		assertThrows(InvalidNumException.class,()->student.calcTotal(10,10, 190));
			}
	@Test @DisplayName("Testing grade A")
	void testGetGradesA() throws InvalidNumException {
			int[] marks= {98,95,98};
			String grade=student.getGrade(marks);
			assertEquals("A",grade,"Expecting grade A");
			}
	@Test @DisplayName("Testing grade B")
	@Tag("gradeb")
	void testGetGradesB() throws InvalidNumException {
			int[] marks= {85,86,87};
			String grade=student.getGrade(marks);
			assertEquals("B",grade,"Expecting grade B");
			}
	@Test @DisplayName("Testing grade C")
	void testGetGradesC() throws InvalidNumException {
			int[] marks= {66,76,79};
			String grade=student.getGrade(marks);
			assertEquals("C",grade,"Expecting grade C");
			}
	@Test @DisplayName("Testing grade D")
	void testGetGradesD() throws InvalidNumException {
			int[] marks= {55,54,59};
			String grade=student.getGrade(marks);
			assertEquals("D",grade,"Expecting grade D");
			}
	@Test @DisplayName("Testing grade Fail")
	@Tag("Fail")
	void testGetGradesFail() throws InvalidNumException {
			int[] marks= {44,45,49};
			String grade=student.getGrade(marks);
			assertEquals("Fail",grade,"Expecting grade Fail");
			}
	@Test @DisplayName("Testing null")
	void testnull() throws InvalidNumException {
			assertNull(student.getGrade(null));
			}
	

	
}
