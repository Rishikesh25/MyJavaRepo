package mypkg2;

import java.util.Scanner;

public class MyClass {

	

	public static void main(String[] args) {
	 //To print  valid age
		int age ;
		Scanner obj = new Scanner(System.in);
		char ch = 'i';
		
		
        do {
        	System.out.println("Enter your age: ");
            age = obj.nextInt();
            
        
        if( age<=18 || age >=58)
        {
        System.out.println("Please enter valid age");
        } 
        else
          {
        	 System.out.println("Valid age");
        	ch = 'v';
     		
          }
        	
	}while(ch!= 'v');
        obj.close();
        }

}
