package practiseprograms;

public class PolyChild extends PolyParent{
	
	public void display() {
		super.display();
		System.out.println("This is my CHILD INSTANCE METHOD");
	}
	
	public int calculator(int a, int b)
	{
		System.out.println(super.calculator(100, 10));
		int difference = a - b;
		return difference;
		
	}
	
	

	

	

	

	

	@Override
	public void creep(int a) {
		
		super.creep(a);
	}

	public static void main(String[] args) {
		
		PolyChild object = new PolyChild();
		object.display();
		System.out.println(object.calculator(100, 90));
		object.creep(44);

	}

}
