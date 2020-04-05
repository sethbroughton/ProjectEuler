package com.projecteuler;

public class DoubleBasePalindrome {
	
	public int solution() {
		int sum = 0;
		for(int i = 1; i<1000000; i++) {
			String binaryNum = Integer.toBinaryString(i);
			String num = Integer.toString(i);
					
			if(isPalindrome(num) && isPalindrome(binaryNum)) {
				sum += i;
			}
		}
	
		
		return sum;
	}
	
	
	private boolean isPalindrome(String str) {
		//start in the  and work out
		//String str = Integer.toString(num);
		int i = 0;
		int j = str.length()-1;
		while(i<j){
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		
		}
		return true;
	}

}
