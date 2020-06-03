package com.projecteuler;


public class Fib1000 {

	public int solution() {
		double phi = (1+Math.sqrt(5))/2; 
		return (int) Math.ceil((Math.log10(5)/2 + 1000 - 1) / Math.log10(phi));
	}

}
