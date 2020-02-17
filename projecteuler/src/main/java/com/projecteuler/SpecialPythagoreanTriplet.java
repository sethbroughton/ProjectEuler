package com.projecteuler;

public class SpecialPythagoreanTriplet {
	
	public int product() {
		
		for(int b = 1; b<1000; b++) {
			for(int a = 0; a<b; a++) {
				int c = 1000-a-b;
				if(Math.pow(((a*a)+(b*b)),0.5)==c) {
					return a*b*c;
				}
			}
		}
		return 0;
	}
}
