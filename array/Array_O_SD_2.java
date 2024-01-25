package array;             
//Object class Array for multiple datatypes to same variable -- Single Dimensional
public class Array_O_SD_2 {
	public static void main(String[] args) {
		Object arrayRef[] = new Object[5];

		arrayRef[0]="Wings";
		arrayRef[1]=00.7;
		arrayRef[2]=true;
		arrayRef[3]=4;
		arrayRef[4]="claws";
		//arrayRef[5]='Z';          //ArrayIndexOutOfBoundsException comes here if we try to execute as Array size defined as 5
		System.out.println(arrayRef[2]);
		
		System.out.println();
		
		for(Object elements : arrayRef) {          // for-each loop
			System.out.println(elements);
		}
		
		System.out.println();
		
		for(int i=0; i<arrayRef.length; i++) {        //normal loop
			System.out.println(arrayRef[i]);
		}
		

	}
}
