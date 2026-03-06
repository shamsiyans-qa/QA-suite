package polymorphism;

public class ChildPoly extends ParentPoly {
	public void display()
	{
		super.display();
		
		System.out.println("Hello");
		}
	
	public int display(int a)

	{
		System.out.println(super.display(78));
		return a;	
	}

	
	

	@Override
	public int display(int a, int b) {
		// TODO Auto-generated method stub
		return super.display(a, b);
	}

	
	

	
	
	

	

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildPoly object = new ChildPoly();
		object.display();
		System.out.println(object.display(120));
		System.out.println(object.display(11, 12));

	}

}
