package pkg1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Binary_search {

	public static void main(String[] args) {
		
		List <Integer> data = Arrays.asList(25,45,11,97,33,91,83,51);
		int searchEle=13;
		int low, mid,high;
		low=0;
		high= data.size();
		mid= (low+high)/2;
		high= data.size();
		
		
		
		while(true)
		{
		//System.out.printf("low: %d ,mid: %d,high: %d",low,mid,high);
			 
			 System.out.println("low:"+low+",high:"+high+ ",mid:" +mid);
            

			if (searchEle==data.get(mid))
			{
				System.out.println("Element found at:" +mid);
				break;
			}
			if(mid==low || mid==high)
			{
				System.out.println("Elememt not found");
				break;
			}
			if(searchEle>data.get(mid))
			    low=mid;
		
		else
			high=mid;
			//now take new mid 
			mid= (low+high)/2;
			
	
			
			    
			
				
			
		}
		
	}

}
