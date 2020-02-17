package com.projecteuler;

public class SummationOfPrimes {

	public long sum() {
		long sum = 0;
		int max = 2000000;
		for (int i = max; i > 1; i--) {
			if (isPrime(i)) {
				sum += i;
			}
		}
		return sum;
	}

	public boolean isPrime(int num) {
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
