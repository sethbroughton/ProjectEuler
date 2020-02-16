package com.projecteuler;

public class LargestPrimeFactor {

	/*
	 * The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime
	 * factor of the number 600851475143 ?
	 */

	public int largest() {
		int largest = 1;
		long num = 600851475143L;
		while (num != 1) {
			largest++;
			if (num % largest == 0) {
				num = num / largest;
			}
		}
		return largest;
	}
}
