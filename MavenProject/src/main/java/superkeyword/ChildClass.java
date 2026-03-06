package superkeyword;

public class ChildClass extends ParentClass {
	String color = "White";
	
	public void display()
	{
		System.out.println(super.color);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass object = new ChildClass();
		System.out.println(object.color);
		object.display();

	}

}
