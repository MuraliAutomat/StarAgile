package javaAssignments;   
// 3. Write a Java Program to handle given uncheck exception
// a) ArrayIndexOutOfBoundsException

public class ArrayException {

	public static void main(String[] args) {

		try {
			int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

			System.out.println(array[10]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception: " + e);
			System.out.println("Please Enter Index Number only from 0 to 9: ");
		}


	}

}
