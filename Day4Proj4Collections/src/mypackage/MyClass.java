package mypackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class MyClass {

	public static void main(String[] args) {
   /*PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
   pq.add(50);
   pq.add(100);
   pq.add(120);
   
   System.out.println(pq.peek());
   System.out.println(pq.poll());
   System.out.println(pq.peek()); */
		
	/*	TreeSet<Integer> data = new TreeSet<Integer>();
		data.add(25);
		data.add(45);
		data.add(25);
		data.add(74);
		
		for(int d:data)
		System.out.println(d); */
		
		HashMap<Integer, String> data = new HashMap<Integer,String>();
		data.put(1, "Hrishi");
		data.put(2, "Meg");
		data.put(3, "Abhi");
		
		System.out.println(data.get(2));
		
	}

}
