package array;
//Object class Array for Multi-Dimensional Array with Multiple Datatypes  -- Loops (for-each, for)
public class Array_O_MD {

	public static void main(String[] args) {
		Object[][] arrayRef = { {"aama", 1211, 0.05, true, 'M'}, {"aana", 1411, 0.03, "wings", 'N'}, {"aada", 1171, 0.04, true, 'D'} };    // 3 rows X 5 columns 

		for(Object i[] : arrayRef) {
			for(Object elements : i) {
				System.out.print(elements+" ");
			}
			System.out.println();
		}

		System.out.println();

		for(int m=0; m<arrayRef.length; m++) {
			for(int n=0; n<arrayRef[m].length; n++){
				System.out.print(arrayRef[m][n]+" ");
			}
			System.out.println();
		}



	}

}
