package finalkeyword;

public class FinalVariable {
	
	final public void display()
	{
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int a = 10;
		//a= 10; final variable cannot be re initialised.
		System.out.println(a);

	}

}
