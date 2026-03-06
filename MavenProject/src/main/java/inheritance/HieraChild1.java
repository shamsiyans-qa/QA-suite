package inheritance;

public class HieraChild1 extends HieraParent {
	
	public void list()
	{
		System.out.println("Hierarchical Child 1 class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HieraChild1 object1 = new HieraChild1();
		object1.display();
		object1.list();
		

	}

}
