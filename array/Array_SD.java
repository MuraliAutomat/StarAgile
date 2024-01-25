package array;               // SD -- Single Dimensional Array

class Array_SD {

	public static void main(String[] args) {

		int[] j = new int[6];     // Array creation by creating its object by 'new' keyword and declaring its size 6
		j[0]=90;
		j[1]=80;
		j[2]=70;
		j[3]=60;
		j[4]=50;
		j[5]=40;
		System.out.println(j[2]);
		System.out.println(j[0]);
		System.out.println(j[5]);

		short[] arrayRef = new short[7];
		arrayRef[0]=121;
		arrayRef[1]=152;
		arrayRef[2]=143;       // Note: 3rd index is missing as we do not put and no error. As default Java puts zero at 3rd index (whichever index you've not initialized, it will be default values based on its data_type) 
		arrayRef[4]=175;               
		arrayRef[5]=146;
		arrayRef[6]=995;
		//arrayRef[7]=885;      // Exception: java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7. i.e, Here Array's max capacity is 7, therefore its last index can be 6. Wherein, Array always start from Zero index, so zero index also considered it has Value/ Element
		
		System.out.println();                                            // empty just for space in console
		System.out.println("Array Length: "+arrayRef.length);
		
		System.out.println("normal loop");   
		for(int i=0; i<arrayRef.length; i++)        // Note: Avoid '=' at condition check in loop section, otherwise ArrayIndexOutOfBoundsException comes even when you write correct indexing.
		{
			System.out.println(arrayRef[i]);        // normal for loop
		}
		
		System.out.println();                                                  // empty just for space in console
		
		System.out.println("for-each loop"); 
		for(int values : arrayRef)                       // for-each loop
		{
			System.out.println(values);
			
		}
		
		

	}

}
