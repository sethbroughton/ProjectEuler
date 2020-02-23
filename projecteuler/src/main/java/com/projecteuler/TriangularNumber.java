package com.projecteuler;

public class TriangularNumber {

	// TRIANGULAR NUMBER WITH 500 DIVISORS
	public long divisorsGreaterThan500() {
		long number = 1;
		long index = 500;
		while(countDivisors(number)<500) {
			number = triangularNumber(index);
			index++;
		}
		return number;
	}

	// COUNT DIVISORS
	public long countDivisors(long number) {
		long count = 0L;
		for (long i = number; i > 0; i--) {
			if (number % i == 0) {
				count++;
			}
		}
		return count;
	}

	// CALCULATE TRIANGULAR NUMBER
	public long triangularNumber(long number) {

		if (number == 1) { // BASE CASE
			return 1;
		} else { // RECURSIVE CASE
			return (number + triangularNumber(number - 1));
		}

	}
}
