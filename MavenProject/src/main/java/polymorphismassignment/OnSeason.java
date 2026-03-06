package polymorphismassignment;

import java.util.Scanner;

public class OnSeason extends OffSeason{
	
	public void discount()
	{
		super.discount();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rate of the clothes (OnSeason) : ");
		double rate = sc.nextDouble();
		double total = rate - ( 0.4d * rate);
		System.out.println("Price after OnSeason discount is : " + total);
	}
	
	


	public static void main(String[] args) {
	OnSeason object = new OnSeason();
	object.discount();

	}

}
