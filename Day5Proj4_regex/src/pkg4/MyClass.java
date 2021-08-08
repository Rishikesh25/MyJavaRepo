package pkg4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyClass {

	public static void main(String[] args)
	{  
	  
		Pattern p = Pattern.compile("\\B");
		Matcher m = p.matcher(" Hrishi656ABN ");
		
		if(m.matches())
		{System.out.println("Valid Code");
	 	} 
		else
		{System.out.println("Invalid Code");
        }

}}
