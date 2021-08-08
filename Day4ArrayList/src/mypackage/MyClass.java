package mypackage;

import java.util.ArrayList;
import java.util.Scanner;
public class MyClass {

	public static void main(String[] args)
	{
    ArrayList<Integer> data = new ArrayList<Integer>();
     data.add(50);
     data.add(2000);
     data.add(40);
     data.add(412);
     
     int sum=0 ;
     for (int d :data)
    	 sum=sum+d;
System.out.println(sum);
	}

}
