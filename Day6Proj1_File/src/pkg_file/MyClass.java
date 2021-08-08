package pkg_file;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) 
	
	{   try 
	   { 
		
		//File object
		//File f1 = new File("D:\\Project.txt");
		
/* System.out.println("FileName:" +f1.getName());
System.out.println("CompletePath:"+f1.getPath());
System.out.println("CompletePath:" +f1.exists()); */
		//File Reader object
		//FileReader fr = new FileReader(f1);
		//Object for buffered reader,give file reader to buffered reader to get line by line. 
	//	BufferedReader br = new BufferedReader(fr);
	/*int i = fr.read();
		while(i!=-1)
		{   
			System.out.print(i+ " , ");
			i = fr.read();
		} */
	/*	String line = br.readLine();  //giving to br
		while (line!=null)
		{
			System.out.println(line);
			line = br.readLine();
			
		}
		br.close();
		fr.close();  */
		List<String> allLines =  Files.readAllLines(Paths.get("D:\\Scores.txt"));
		ArrayList <Integer >studentScore = new ArrayList <Integer>();
		/* for(var a : allLines)
			System.out.println(a); */
		boolean isFound = false;        //variable declaration
		String name;
		int score = 0;
		Scanner obj =new Scanner(System.in);
		
		System.out.println("Enter name of student:");        // read data from user
		name = obj.next();
		
		for (String a :allLines)
		{ String[] data = (String[]) a.split(",");
		  if(data[0].equals(name))
		  {
		  studentScore.add(Integer.parseInt( data[1]));
		  isFound = true;
		
		}
		
	} 
		if(isFound)
		{
		for(int k:studentScore)
			System.out.println(k);
		}
		
		else {
			System.out.println("Student is absent");
		}
	   }catch (Exception Ex)
	{
		
	} 
}

	
	}
