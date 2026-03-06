package interfacetest;

public interface Parent1Interface {
	
	public static final int a = 100;//its value cannot be reassigned ,since it is having final keyword
       int b = 90;
	public abstract void display();
	
	public static void key()
	{
		System.out.println("This is Parent Interface's static method");
	}
	
	default void set()
	{
		//a = 50;
		//b = 56; interface variable will be always final 
		System.out.println("Default method in Parent Interface");
	}
	
	}

