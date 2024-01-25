package javaAssignments;
// 4. Write a Java Program to sort the ArrayList in Ascending order
import java.util.ArrayList;
import java.util.Collections;

public class ArrayAscending {
	
	public static void main(String[] args) {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		arraylist.add(6);
		arraylist.add(4);
		arraylist.add(3);
		arraylist.add(1);
		arraylist.add(2);
		arraylist.add(7);
		arraylist.add(5);

		//actual order
		System.out.println("Actual Order: ");	
		System.out.println(arraylist);		

		Collections.sort(arraylist);
		// ascending order
		System.out.println("Ascending Order: ");	
		System.out.println(arraylist);	

	}

}
