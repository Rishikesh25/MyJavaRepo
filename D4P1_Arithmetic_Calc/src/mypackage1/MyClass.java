package mypackage1;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) 
	{
		//variable declaration
		int ans,result = 0,a,b;
		 boolean isValid= true;
		Scanner obj = new Scanner(System.in);
		
		   //read numbers from the user
		   System.out.println("Enter first number: ");
		   a = obj.nextInt();
		   System.out.println("Enter second number: ");
		   b = obj.nextInt();
		   
	System.out.println("Calculator Menu: ");
	System.out.println("1.Addition");
	System.out.println("2.Subtraction");
	System.out.println("3.Multiplition");
	System.out.println("4.Division");
	   ans = obj.nextInt();
	   
	   
	   switch (ans)
	   {  case 1 :
		   result = a+b;
		   break;
		   
	      case 2 : 
		   result = a-b;
			break;
			
	      case 3 : 
		   result = a*b;
				break;
				
	      case 4 : 
		   result = a/b;
				break;	
			
		  default: 
			  isValid = false;
	   }
	   if (isValid)
	   {
          System.out.println("Result = " +result);
	}
	   else
	   { 
		   System.out.println("Invalid Option");
	   }
}}
