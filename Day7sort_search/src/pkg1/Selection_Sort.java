package pkg1;

public class Selection_Sort {

	public static void main(String[] args) {
		int index, j;
		
		int data[] = new int[] { 71, 67, 89, 92, 56 };

		for (int i = 0; i < data.length; i++)
			
		{  index=i;
			for (j = i + 1; j < data.length; j++) 
			{   
				if (data[j] < data[index])
					index = j;
			}
			int smallnum = data[index];
			data[index] = data[i];
			data[i] = smallnum;
		}
		for (int i = 0; i < data.length; i++)
			System.out.println(data[i]);

	}

}
