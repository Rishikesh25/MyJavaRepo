package package3;

public class MyClass {

	class EnglishMsg {
		
		public void printHi () 
		{
          System.out.println("Hi");
	}
	public void printHello()
	{ 
		System.out.println("Hello");
	}
		
    public void printGoodMorning()
    {   System.out.println("GoodMorning");

	}
	}
class HindiMsg extends EnglishMsg 
   {   
	@Override
	public void printGoodMorning()
	{  System.out.println("Suprabhat");
    }
   }
		
}
	