package array;                 // SD -- Single Dimensional Array

public class Array_SD_2 {

	public static void main(String[] args) {

		byte[] arrayRef = {40, 50, 55, 25, 87, 44, 65, 74, 18, 07, 36, 11, 21, 60};         // 'new' keyword is NOT used here for array object creation, but with this curly brace syntax of Array type, automatically internally Java creates object.

		System.out.println("Array Length: "+arrayRef.length);
		System.out.println("Element at Index 2: "+arrayRef[2]);
		System.out.println("Element at Index 0: "+arrayRef[0]);
		System.out.println("Element at Index 13: "+arrayRef[13]);
		//System.out.println("Element at Index 14: "+arrayRef[14]);           // ArrayIndexOutOfBoundsException because NO index 14 because Array Length is 14, hence max Index is 13 due to Array Index starts from 0.

		System.out.println();   // empty just for gap in console

		for(int i=0; i<arrayRef.length; i++)                  // normal for loop
		{
			System.out.println(arrayRef[i]);
		}


		System.out.println();   // empty just for gap in console


		for(int values : arrayRef)                            // for-each loop
		{
			System.out.println(values);
		}


		System.out.println();   // empty just for gap in console

		for(int i=0; i<arrayRef.length-10; i++)                // normal for loop (length reduced)
		{
			System.out.println(arrayRef[i]);
		}


	}

}
