package polymorphism2;

public class ChildPoly2 extends ParentPoly2
{
	public void display()
	{
		super.display();
		System.out.println("This is a non parameterised CHILD class method");
	}
	
	public int print(int a,int b)
	{
		System.out.println(super.print(10, 5));
		int difference = a - b;
		return difference;
	}

	
	
	@Override
	public void show(int a) {
		// TODO Auto-generated method stub
		super.show(a);
		System.out.println(a); // separate print statement should be given to a to print a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildPoly2 object = new ChildPoly2();
		object.display();
		System.out.println(object.print(20, 10));
		object.show(90);

	}

}
