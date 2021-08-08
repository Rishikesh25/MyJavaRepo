//**
 * 
 */
package pkg3;

import java.util.Scanner;

/**
 * @author hp
 *
 */
public class MyCLASS {

	/**
	 * @param args
	 * @param i 
	 */
	public static void main(String[] args) {
		int k ;
		Scanner obj =new Scanner(System.in);
		System.out.println("Enter any number: ");
		k =obj.nextInt();

		for(int i=1;i<=10;i++)
		{  System.out.println(k+"x"+i+"="+k*i);
	     }

}}
