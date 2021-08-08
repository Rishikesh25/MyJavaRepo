package pkg1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MyClass1 {

	public static void main(String[] args) {
		List <Integer> data = Arrays.asList(25,12,45,66,42,38,75,29,52);
		
		int searchEle,i; 
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Search Element: ");
	  searchEle = obj.nextInt();
	  
	//  for(var d : data)
	  for( i=0;i<data.size();i++)
	  {   if (data.get(i)==searchEle)
	  {
		 
		
		break;
	  }
     
	}
	 
	if(i==data.size()) {
		  System.out.println("Element not found");
		  }
	  else {
		  System.out.println("Element found at location:" +i);
	  }
	  }
}

