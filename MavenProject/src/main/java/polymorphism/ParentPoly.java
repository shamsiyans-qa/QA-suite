package polymorphism;

public class ParentPoly {
	
	public void display()
	{
		System.out.println("This is a non parameterised instance method");	}
	
	public int display(int a)
	{
		return a;
	}
	
	public int display(int a, int b)
	{
		int c= a+b;
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
