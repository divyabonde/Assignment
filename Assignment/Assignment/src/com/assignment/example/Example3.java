package com.assignment.example;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "The Quick brown fox jumps over a lazy dog";
		System.out.println(isPangram(sentence));
	}
	
	public static boolean isPangram(String sentence) {
		if(sentence == null || sentence.length()<26) {
			return false;
		}
		sentence = sentence.toLowerCase();
		
		for(char c='a'; c<='z'; c++)
		{
			if(!sentence.contains(String.valueOf(c))) {
				return false;
			}
		}
		
		return true;
	}

}
