package mypackage;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) 
	{
	Employee emp= new Employee(4500);
	emp.readNameAndAge();
	emp.PrintData();
	}

}
class Employee
{   private String name;
   private int salary;
   private int age;
     
   Employee()
   {
	   name=null;
	   salary=0;
	   age=0;
	   
   }
    Employee(String name , int salary,int age)
    { this.name=name;  
    this.salary=salary;
    this.age=age;
    
    }
    Employee(int salary)
    {   this.salary= salary;
    }
    public void ReadData()
    {   Scanner obj = new Scanner(System.in);
      System.out.println("Enter name: ");
       name= obj.next();
       System.out.println("Enter salary: ");
       salary= obj.nextInt();
       System.out.println("Enter age: ");
       age=obj.nextInt();
       obj.close();
    
    }
    
    public void PrintData()
    {
    	System.out.println("Name= " +name);
    	System.out.println("salary= " +salary);
    	System.out.println("Age= " +age);
    }
    public void readNameAndAge()
    {   Scanner obj = new Scanner(System.in);
    System.out.println("Enter name: ");
    name= obj.next();
    System.out.println("Enter age: ");
    age=obj.nextInt();
    obj.close();
}}