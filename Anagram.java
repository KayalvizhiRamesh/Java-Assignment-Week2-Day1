package week2.day1;

import java.util.Arrays;

public class Anagram {

	/* 	 * Pseudo Code
	 *Declare a String 
		String text1 = "stops";
	 *Declare another String
		String text2 = "potss"; 
	 * a) Check length of the strings are same then (Use A Condition)
	 * b) Convert both Strings in to characters
	 * c) Sort Both the arrays
	 * d) Check both the arrays has same value
	 * 
	 */
	public static void main(String[] args) {
		String text1 = "stops"; // Declare a String String text1 = "stops"
		String text2 = "potss"; // Declare another String text2 = "potss"; 
		
		if (text1.length() == text2.length()) {
			char[] array1 = text1.toCharArray();
			char[] array2 = text2.toCharArray();
			Arrays.sort(array1);
			Arrays.sort(array2);
			if(Arrays.equals(array1,array2)) {
				System.out.println("The given string is an anagram");
			}
			else {
				System.out.println("The given string is not an anagram");
			}
		}
		
	}
}
