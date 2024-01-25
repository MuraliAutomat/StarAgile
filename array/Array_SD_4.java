package array;                  // SD -- Single Dimensional Array

public class Array_SD_4 {

	public static void main(String[] args) {
		
		byte[] arrayRef = {14, 16, 16, 21, 32, 69, 52, 24};
		
		System.out.println("for-each loop");
		for (byte value:arrayRef) {
			System.out.println(value);
		}

		System.out.println();
		
		System.out.println("without loop");
		System.out.println("ArrayLength: "+arrayRef.length);
		System.out.println(arrayRef[1]);
		System.out.println(arrayRef[7]);
		System.out.println(arrayRef[0]);
		System.out.println(arrayRef[1]);
		System.out.println(arrayRef[3]);
		
		System.out.println();
		
		System.out.println("normal loop");
		for(byte i=0; i<arrayRef.length; i++) {
			System.out.println(arrayRef[i]);
		}
		
	}

}
