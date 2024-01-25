package array;     
// Multi-Dimensional Array  -- Loops (for-each, for)
public class Array_MD {

	public static void main(String[] args) {
		int arrayRef[][]= { {7,5,0}, {1,4}, {2,5,8}, {3}, {5,6,1,9} };         // 5 Rows X 4 Columns
		
		for(int i[]: arrayRef)               // each row iterates
		{
			for(int elements : i)          // iterates column times w.r.t row
			{
				System.out.print(elements+" ");
			}
			System.out.println();
		}
	
		
		System.out.println();
		// normal for loop
		
		for(int m=0; m<arrayRef.length; m++) 
		{
			for(int n=0; n<arrayRef[m].length; n++) 
			{
				System.out.print(arrayRef[m][n]+" ");
			}
			System.out.println();
		}
		
		

	}
	
}


