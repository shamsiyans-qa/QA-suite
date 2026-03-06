package interfacetest;

public class ChildClassTest implements InterfaceParent1,InterfaceParent2 {

	public static void main(String[] args) {
	ChildClassTest object = new ChildClassTest(); //better to create child class object other than referencing in the case of Multiple Inheritance 
	object.tat();
	object.mat();
	object.display();
		

	}

	@Override
	public void mat() {
		System.out.println("This is Interface2 abstract method");
		
	}

	@Override
	public void tat() {
		System.out.println("This is Interface1 abstract method");
		
	}

	@Override       //here, 2 method name is created in the 2 parent class and on override it is displayed for both intrerface
	public void display() {
		System.out.println("Same Method Name which is created in Parent class1");
		System.out.println("Same Method Name which is created in the Parent class2");
		
	}

}
