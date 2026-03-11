package practiseprograms;

public class MultiChildInher implements MultiParent1,MultiParent2 {

	public static void main(String[] args) {
		MultiChildInher object = new MultiChildInher();
		object.display();
		object.show();
		
	}

	@Override
	public void display() {
		System.out.println("This is my first abstract method body");
		
	}

	@Override
	public void show() {
		System.out.println("This is my second abstract method body");
	}

}
