package inheritance;

public class SingleChild extends SingleParent
{
	
	public void details()
	{
		System.out.println("This is Child Class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleParent object = new SingleParent();
		object.display();
		SingleChild object1 = new SingleChild();
		object1.details();
		object1.display();

	}

}
