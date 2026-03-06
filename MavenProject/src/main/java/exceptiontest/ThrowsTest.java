package exceptiontest;

public class ThrowsTest {

	public static void main(String[] args) throws Exception {
	
		int age = 10;
		if(age>18)
		{
			System.out.println("Eligible for VOTE");
		}
		else {
			throw new Exception("NOT ELIGIBLE");
		}
	}

}
