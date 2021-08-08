package mypkg;

public class MyClass {

	public static void main(String[] args) {
		char[][] names = new char [][]
				{    new char [] {'H','r','i','s','h','i'},
			         new char [] {'r','a','m'},
			         new char [] {'n','i','l','a','m'}
				};
		for (int i=0;i<names.length;i++)
		{
          for(int j=0;j<names[i].length;j++ )
          {
	        System.out.print(names[i][j]+ "");
	        }
          System.out.print("\n");
}
		}}