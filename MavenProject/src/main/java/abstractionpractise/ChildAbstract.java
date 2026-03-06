package abstractionpractise;

public class ChildAbstract extends ParentAbstract {
	
	public ChildAbstract() {
		super(1000,2000);
		System.out.println("Created again a non parameterised constructor");
	}
	
	public void show()
	{
		System.out.println("THIS IS A CHILD CLASS INSTANCE METHOD");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildAbstract object1 = new ChildAbstract();
		object1.show();
		
				
				
		ParentAbstract object = new ChildAbstract();
		object.display();
		System.out.println("Sum of the numbers is : " + object.sum(10, 5));
		object.set();
		
		
		
		
		

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This is parent class override method");
	}

	@Override
	public int sum(int a, int b) {
	int total = a + b;
		return total;
	}

	


}
