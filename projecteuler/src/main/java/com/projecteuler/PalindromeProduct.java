package com.projecteuler;

public class PalindromeProduct {

	public int largest() {
		int largest = Integer.MIN_VALUE;
		for (int i = 999; i > 100; i--) {
			for (int j = 999; j > 100; j--) {
				if (isPalindrome(i * j) && (i*j>largest)) {
					largest = i*j;
				}
			}
		}
		return largest;
	}

	public boolean isPalindrome(int num) {
		String number = Integer.toString(num);
		int length = number.length();
		for (int i = 0; i < length / 2; i++) {
			if (!number.substring(i, i + 1).equals(number.substring(length - 1 - i, length - i))) {
				return false;
			}
		}
		return true;
	}
}
