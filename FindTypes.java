package week2.day1;

public class FindTypes {
	
	public static void main(String[] args) {
		// Here is the input
		String test = "$$ Welcome to 2nd Class of Automation $$ ";

		// Here is what the count you need to find
		int  letter = 0, space = 0, num = 0, specialChar = 0;

		// Build the logic to find the count of each
		/* Pseudo Code:
			a) Convert the String to character array
			b) Traverse through each character (using loop)
			c) Find if the given character is what type using (if)
					i)  Character.isLetter
					ii) Character.isDigit
					iii)Character.isSpaceChar
					iv) else -> consider as special character
		*/
		char[] array = test.toCharArray();
		for(int i=0;i<array.length;i++) {
			if(Character.isLetter(array[i])==true) {
				letter++;
			}
			else if(Character.isDigit(array[i])==true) {
				num++;
			}
			else if(Character.isSpaceChar(array[i])==true) {
				space++;
			}
			else{
				specialChar++;
			}
		}
		
		System.out.println("letter: " + letter);
		System.out.println("number: " + num);	
		System.out.println("space: " + space);
		System.out.println("specialCharcter: " + specialChar);
	}

}
