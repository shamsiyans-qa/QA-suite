package abstractionpractise;

public abstract class ParentAbstract {
	
	
	public ParentAbstract() {
	System.out.println("THIS IS A PARENT CLASS CONSTRUCTOR");
	}
	
	public ParentAbstract(int a, int b) {
		System.out.println("Enter the first digit : " + a);
		System.out.println("Enter the second digit : " + b);
	}
	
	public abstract void display();
	public abstract int sum(int a,int b);
	
	public void set()       //INSTANCE VARIABLE
	{
		System.out.println("This is a Parent class INSTANCE METHOD");
	}

}
