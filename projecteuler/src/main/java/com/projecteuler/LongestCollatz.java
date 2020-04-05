package com.projecteuler;

import java.util.HashMap;
import java.util.Map;

public class LongestCollatz {
	private Map<Long, Long> memo = new HashMap<Long, Long>(); //Memoization

	public long largest() {
		long max = 0;
		long num = 0;
		for (long i = 1; i <= 1000000; i++) {
			long length = sequenceLength(i);
			if (length > max) {
				max = length;
				num = i;
			}
		}
		return num;
	}

	public long sequenceLength(long number) {
		long counter = 1;
		long startingNumber = number;
		while (number > 1) {
			if (number % 2 == 0) {
				number = number / 2;
			} else {
				number = number * 3 + 1;
			}
			//Check if number is in the memo
			if (memo.containsKey(number)) {
				counter = counter + memo.get(number);
				memo.put(startingNumber, counter);
				return counter;
			} 
			counter++;
		}
		memo.put(startingNumber, counter);
		return counter;
	}

}
