package com.projecteuler;

public class Kata {

	public String SongDecoder(String song)
	{ String word = "";
	
	String[] words = song.split("WUB");
	for(String subword : words) {
		word = word + subword + " ";
	}
	return word.trim();
	}
}
