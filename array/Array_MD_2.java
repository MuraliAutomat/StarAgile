package array;
//Multi-Dimensional Array  -- Loops (for-each, for)
public class Array_MD_2 {

	public static void main(String[] args) {
		int[][] arrayRef = { {1,2,3,4,5}, {6,7,8}, {9,0,1,2,3}, {4,5} };      // 4 Rows X 5 Columns
		//int[][] arrayRef = { {1,2,3,4,5}, {6,7,8,9,9}, {9,1,1,2,3}, {1,1,3,4,5}, {4,7,2,6,8} };    // 5 Rows X 5 Columns
		
		for(int[]i : arrayRef)                                  // Array notation at outer loop of for-each loop
		{
			 for(int elements : i) 
			 {
				 System.out.print(elements +" ");
			 }
			 System.out.println();
		}
	
		
		System.out.println();
		
		for(int m=0; m<arrayRef.length; m++) 
		{
			for(int n=0; n<arrayRef[m].length; n++)   // Array notation at inner loop of normal loop
			{
				System.out.print(arrayRef[m][n]+" ");   // Array notation at inner loop in S.O.P of normal loop
			}
			System.out.println();
		}
				
			
	}

}
