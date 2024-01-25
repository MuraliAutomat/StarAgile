package array;
//Object class Array for multiple datatypes to same variable -- Single Dimensional  without Size declaration
public class Array_O_SD_3 {

	public static void main(String[] args) {
		Object arrayRef[]= {"Wings", 0.07, 3, 'C', false, 84};
		
		for(Object elements : arrayRef) {           //for-each loop
			System.out.println(elements);
		}
       
		System.out.println();
		
		for(int i=0; i<arrayRef.length; i++) {      //normal loop
			System.out.println(arrayRef[i]);
		}
		
		
	}

}
