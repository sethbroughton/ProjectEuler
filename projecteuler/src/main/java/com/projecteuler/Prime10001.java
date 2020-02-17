package com.projecteuler;

public class Prime10001 {
	
	/*
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
	 * What is the 10001st prime number?
	 */
	
	public int finder() {
		int counter = 0;
		int number = 1;
		while(counter<10001) {
			number++;
			if(isPrime(number)) {
				counter++;
			}
		}
		return number;
	}
	
	public boolean isPrime(int number) {
		for(int i = 2; i<number; i++) {
			if(number%i == 0) {
				return false;
			}
		}
		return true;
	}

}
