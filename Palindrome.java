package week2.day1;

public class Palindrome {
	
	public static void main(String[] args) {
	
	String text = "madam"; // Declare A String value as"madam"
	String rev = ""; // Declare another String rev value as ""
	
	char[] array = text.toCharArray();  // convert the string into char array
	
	for (int i=(array.length-1); i>=0; i--) { // Iterate over the String in reverse order
		rev = rev + array[i]; //Add the char into rev
	}
	if(text.equals(rev)==true) { //Compare the original String with the reversed String, if it is same then print palinDrome 
		System.out.println(text);
	}
}
}