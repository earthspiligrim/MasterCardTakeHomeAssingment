package com.takehome.assingment;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
	
	/*
	 * My Approach: Since the total number of alphabets are 26. It just that the number of times any 
	 * particular alphabet can be more than 1. So I have defined a constant space integer array where
	 * I can increment the index of the array as per the chronological order of their order to the 
	 * total number of their occurrences.
	 * 
	 * I would now iterate through the second string and decrement the index count with each time 
	 * of their occurrence
	 * 
	 * Now I would iterate through my store array and expect each element to be 0 if a non-zero element is found, I will
	 * return false from the method
	 * 
	 * Space Complexity : O(1)
	 * Explanation: Even though we are using an array since its of constant length its space is O(1)
	 * Time Complexity: O(n)
	 * 
	 * here the actual time complexity is O(2n+26) which is pretty much equivalent to O(n)
	 * 
	 */
	
	public boolean IsAnagram(String s, String t) {
		
		//validating if the lengths of two strings different if it is then there is no chance for the two
		//strings to be anagram
		if(s.length() != t.length()) return false;
	    
        int[] store = new int[26];
       
        for(char eachCharacter: s.toCharArray()) {
            store[eachCharacter - 'a'] ++;
        }
       
        for(char eachCharacter: t.toCharArray()) {
            store[eachCharacter - 'a'] --;
        }
       
        for(int eachStoreElement: store) {
            if(eachStoreElement != 0) return false;
        }
       
        return true;
	}
	
	public static void main(String[] args) {
		/*
			Problem:
			Given two strings s and t, return true if t is an anagram of s, and false otherwise.
			s and t only consist of lowercase English letters.
			An Anagram is a word or phrase formed by rearranging the letters of a different work or phrase,
			typically using all the original letters exactly once.
			Example 1: Input: s = “anagram”, t = “nagaram”; Output: true
			Example 2: Input: s = “rat”, t = “car”; Output: false
			Implement a function called IsAnagram. Consider readability, time complexity, and unit tests.
		 * 
		 */
		
		Anagram anagram = new Anagram();
		
		String inputOneS = "anagram", inputOneT = "nagaram", inputTwoS = "rat", inputTwoT = "car";
		
		System.out.println(anagram.IsAnagram(inputOneS, inputOneT));
		System.out.println(anagram.IsAnagram(inputTwoS, inputTwoT));
	}

}
