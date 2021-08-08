package mypkg1;

public class Maths {
      public final static float PI = (float) 3.4 ;
      
      static class Algebra
      {     public static float add (float a, float b)
    	  {  return a+b;
          }
}
      static class Geometry {
    	  public static float circleArea(float r)
    	  {    return PI*r*r;
    	  
      }
    	  public static float circlePerimeter(float r)
    	  {
    		  return 2*PI*r;
    	  }

      }}