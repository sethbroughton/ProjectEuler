package com.projecteuler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class NamesScores {
	
	public long solution() {
		File inputFile = new File("names.txt");

		List<String> names = new ArrayList<String>();
		
		try(Scanner dataInput = new Scanner(inputFile)){
			while(dataInput.hasNextLine()) {
				String line = dataInput.nextLine();
				String[] input = line.split("\",\"");
				input[0]=input[0].substring(1);
				input[input.length-1] = input[input.length-1].substring(0,input[input.length-1].length()-1);
				Arrays.stream(input).forEach((name)-> names.add(name));		
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Collections.sort(names);
		
		return IntStream.range(0, names.size())
			.mapToLong(i -> {
				return wordValue(names.get(i))*(i+1);
			}).sum();
		
	}
	
	private long wordValue(String word) {
		String[] arr = word.split("");
		return Arrays.stream(arr).mapToInt((letter)->{
			return letter.charAt(0)-64;
		}).sum();
	}

}
