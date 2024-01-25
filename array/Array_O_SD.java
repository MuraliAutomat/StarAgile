package array;  
// Object class Array for multiple datatypes to same variable -- Single Dimensional  with Exception handling
class Array_O_SD {

	public static void main(String[] args) {
		Object arrayRef[] = new Object[5];

		try {
			arrayRef[0]="Wings";
			arrayRef[1]=00.7;
			arrayRef[2]=true;
			arrayRef[3]=4;
			arrayRef[4]="claws";
			arrayRef[5]='Z';
			//System.out.println(arrayRef[4]);              //S.O.P does not work here as there's exception, this S.O.P need to be in catch block
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println(arrayRef[4]);
			
			System.out.println("Exception: " + e);
			System.out.println("Please Enter Index Number only from 0 to 4: ");
		}



	}

}
