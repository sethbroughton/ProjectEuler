package com.projecteuler;

public class SmallestMultiple {

	/*
	 * 2520 is the smallest number that can be divided by each of the numbers from 1
	 * to 10 without any remainder. What is the smallest positive number that is
	 * evenly divisible by all of the numbers from 1 to 20?
	 */
	
	public int smallest() {
		int smallest = 20;
		while (!divisibleBy20(smallest)) {
			smallest++;
		}
		return smallest;
	}

	public boolean divisibleBy20(int num) {
		for (int i = 20; i > 0; i--) {
			if (num % i != 0) {
				return false;
			}
		}
		return true;
	}
}