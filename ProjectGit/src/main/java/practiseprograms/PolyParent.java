package practiseprograms;

public class PolyParent {
	
	public void display() {
		System.out.println("This is my PARENT INSTANCE METHOD");
	}
	
	public int calculator(int a, int b)
	{
		int sum = a + b;
		return sum;
	}
	
	public void creep(int a) {
		System.out.println(a);
	}

}
