package javaAssignments;      
// 1. Write a Java program to reverse a string with and without reverse() function.

public class String_reverse {

	public static void main(String[] args) {

		// with reverse method
		String reverseMethod = "STARAGILE MURALI";
		StringBuilder sb = new StringBuilder();         // Object creation
		sb.append(reverseMethod);
		sb.reverse();
		System.out.println("STARAGILE MURALI: "+sb);

		//without reverse method
		String string = "STARAGILE MURALI";
		String revString = " ";
		char c;

		for(int i=0; i<string.length(); i++) {
			c = string.charAt(i);                         // extracting each character
			revString = c+revString;                  // adding character before empty string
		}
		System.out.println("STARAGILE MURALI: "+revString);

	}

}
