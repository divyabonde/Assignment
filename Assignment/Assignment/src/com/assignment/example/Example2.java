package com.assignment.example;

import java.util.HashMap;
import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Roman Number : ");
		String romanNumber = scanner.next();
//		String romanNumber = "XXX";
		int result = romanToInt(romanNumber);
		System.out.println("Integer equivalent:"+result);
	}
	
	public static int romanToInt(String s)
	{
		HashMap<Character, Integer> romanMap = new HashMap<>();
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);
		
		int result = 0;
		for(int i =0; i<s.length(); i++)
		{
			int current = romanMap.get(s.charAt(i));
			int next = (i+1 < s.length()) ? romanMap.get(s.charAt(i + 1)) : 0;
			
			if(current < next) {
				result += next - current; 
				i++;
			}
			else {
				result += current;
			}
		}
		return result;
	}

}
