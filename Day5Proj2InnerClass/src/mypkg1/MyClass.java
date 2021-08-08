package mypkg1;

import mypkg1.Maths.Geometry;

public class MyClass {

	public static void main(String[] args) {
	//object for outer class
		Maths m = new Maths();
	//object for inner class
	/* Maths.Algebra al = m.new Algebra ();
    System.out.println(al.add(44, 90)); */
		/*Maths.Geometry g = m.new Geometry();
		System.out.println(g.circleArea((float) 5.4)); */
	System.out.println(Maths.Algebra.add(22, 688));
	System.out.println(Maths.Geometry.circleArea(5.7f));
	System.out.println(Maths.Geometry.circlePerimeter(11.4f));
	}

}
