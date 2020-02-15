package com.projecteuler;

public class EvenFibonacci {

	public int sum() {
		int sum = 0;

		int oneBack = 1;
		int current = 2;
		while (current <= 4000000) {
			if (current % 2 == 0) {
				sum += current;
			}
			current = current + oneBack;
			oneBack = current - oneBack;
		}

		return sum;
	}

}
