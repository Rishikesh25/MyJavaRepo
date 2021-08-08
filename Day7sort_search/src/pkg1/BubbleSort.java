package pkg1;

public class BubbleSort {

	public static void main(String[] args) {
		int Max=5 ;
		 
		
		int [] data = new int [] {89,26,74,53,10};
		
		for (int i= Max-1 ; i>=0 ;i--) //from i=4 to i=0
		{
		
			for (int j=0;j<i;j++)   // Iteration from j=0 to j=2
			{
				if (data[j]>data[j+1])
				{
					int temp = data[j];
					data[j]=data[j+1];
					data[j+1]=temp	;			
				}
		
			}
			
		}
		//print values of array(AFTER SORTING) 
		for(int i=0; i<Max; i++) //use regular for loop
      System.out.println(data[i]);
	}

}
