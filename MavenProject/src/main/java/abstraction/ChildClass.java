package abstraction;

public class ChildClass extends AbstractClass{
	
	public ChildClass()
	{
		super(10,100);
		System.out.println("HELP");
	}
	
	public void help()
	{
		System.out.println("Instance method in child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractClass object = new ChildClass();//invoking the child class constructor;if there is non - parameterised constructor in the parent class,it will get invoked  
		object.display();
		System.out.println(object.data(59));
		object.set();
	ChildClass object1 = new ChildClass();//invoking the childclass constructor
	object1.help();
	

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This is my Parent Method");
	}

	@Override
	public int data(int age) {
		// TODO Auto-generated method stub
		return age ;
	}

}
