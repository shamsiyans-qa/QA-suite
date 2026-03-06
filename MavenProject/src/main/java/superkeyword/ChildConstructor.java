package superkeyword;

public class ChildConstructor extends ParentConstructor {
	
	public ChildConstructor()
	{
		super(90,100);
		System.out.println("This is non parameterised child constructor");
	}
	
	public ChildConstructor(int a)
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildConstructor object = new ChildConstructor();
		ChildConstructor object1 = new ChildConstructor(80);
		
		

	}

}
