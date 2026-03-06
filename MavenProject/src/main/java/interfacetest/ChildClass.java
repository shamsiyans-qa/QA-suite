package interfacetest;

public class ChildClass implements Parent1Interface{

	public static void main(String[] args) {
		
		Parent1Interface object = new ChildClass(); //by referencing the interfaceparent
		object.display();
		object.set();
		Parent1Interface.key();
		System.out.println(a + b);

	}

	@Override
	public void display() {
		System.out.println("THIS IS PARENT CLASS ABSTRACT METHOD");
		
	}

}
