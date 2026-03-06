package abstraction;

public abstract class AbstractClass {
	public AbstractClass()
	{
		System.out.println("Abstract constructor");
	}
	
	public AbstractClass(int a,int b)
	{
		System.out.println(a);
		System.out.println(b);
	}

	public abstract void display();
	public abstract int data(int age);
	
	public void set()
	{
		System.out.println("Instance Method");
	}
	
	
	
		
	}


