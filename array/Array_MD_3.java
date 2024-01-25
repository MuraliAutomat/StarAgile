package array;
// Multi-Dimensional Array  -- Loops (for-each, for) -- Addition
public class Array_MD_3 {

	public static void main(String[] args) {
		
		int[][] arrayRef = { {1,1,1,1,1}, {1,1,1,1,1} };
		
		for(int m=0; m<arrayRef.length; m++) 
		{
			int sum1=0; //int sum2 = 0;
			for(int n=0; n<arrayRef[m].length; n++) 
			{
				//System.out.print(arrayRef[m][n]);
				sum1=arrayRef[m][n];
				//sum2+=n;
				
			}
			System.out.println();
			System.out.println(sum1);
			
			//System.out.println(sum2);
		}
		
		
		
		
	}

}
