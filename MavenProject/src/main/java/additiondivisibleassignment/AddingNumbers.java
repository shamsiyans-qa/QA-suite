package additiondivisibleassignment;

/* Program to check the addition result is divisible by 10;
 * Class 1 - Return addition result of two numbers
  Class 2 - Check the addition result is divisible by 10 (use super keyword)*/
 
import java.util.Scanner;

public class AddingNumbers {
	
	public int calculate()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a + b;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
