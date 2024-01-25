package array;                // Addition Single Dimensional Array

public class Array_SD_3 {

	public static void main(String[] args) {

		byte[] arrayRef = {1,1,1,1,1};

		byte addition=0;
		for(byte i=0; i<arrayRef.length; i++)
		{
			//System.out.println(arrayRef[i]);
			addition=  (byte) (addition+arrayRef[i]);       //Casting is done as it cannot covert from int to byte

		}
		System.out.println(addition);

		System.out.println();     // empty just for gap in console
                  
		       int add =0;
				for(byte values : arrayRef)
				{
					//System.out.println(values);
					add+=values;                                   // add = add+values
				}
				System.out.println(add);




	}

}
