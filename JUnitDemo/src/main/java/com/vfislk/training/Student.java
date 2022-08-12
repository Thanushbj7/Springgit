package com.vfislk.training;

import com.vfislk.exception.InvalidNumException;
import com.vfislk.exception.NegValueException;

public class Student {

	public int calcTotal(int m1, int m2, int m3) throws NegValueException, InvalidNumException {
		if (m1 < 0 || m2 < 0 || m3 < 0) {
			throw new NegValueException("Marks should be greater than 0");
		}
		if (m1 > 100 || m2 > 100 || m3 > 100) {
			throw new InvalidNumException("Marks should less than or equal to 100");
		}

		return m1 + m2 + m3;
	}

	public String getGrade(int[] marks) throws InvalidNumException {
		int sum = 0;
		String grade = null;
		if (marks == null)
			return null;
		for (int mark : marks) {
			if (mark < 0 || mark > 100)
				throw new InvalidNumException();
			sum += mark;
		}
		double average = sum / marks.length;
		if (average >= 90) {
			grade = "A";
		}
		if (average >= 80 && average < 90) {
			grade = "B";
		}
		if (average >= 60 && average < 80) {
			grade = "C";
		}
		if (average >= 50 && average < 60) {
			grade = "D";
		}
		if (average < 50)
			grade = "Fail";
		return grade;

	}
}
