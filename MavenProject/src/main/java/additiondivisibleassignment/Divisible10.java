package additiondivisibleassignment;

public class Divisible10 extends AddingNumbers
{
	int sum;
	public void display()
	{
		int sum = super.calculate();
		System.out.println("Sum of two numbers is : " + sum);
		 
		 if (sum % 10 == 0)
		 {
			 System.out.println("The sum is divisible by 10");
		 }
		 else {
			 System.out.println("The sum is NOT divisible by 10");
		 }
		
	}

	public static void main(String[] args) {
		Divisible10 object = new Divisible10();
		object.display();
		
		

	}

}
