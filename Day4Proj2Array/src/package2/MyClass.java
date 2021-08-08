package package2;
import java.util.Scanner;
public class MyClass 
{  //Declare , Read , Print sum avg

	public static void main(String[] args) {
	//Declare the array
	int Max=5;
	int data [] = new int [5];
	int sum = 0 , average;
	Scanner obj = new Scanner(System.in);
	
	//Read numbers from user
	for(int i=0;i<Max;i++)
	{
        System.out.println("Enter any number: ");
        data[i] = obj.nextInt();
	}
	//find sum
	for(int d: data)
		sum=sum+d;
	//find average
	 average = sum/Max;
	 
	 //Print sum 
		System.out.println("Sum:"+sum);
		
	//Print average
		System.out.println("Average:" +average); 
}
}
