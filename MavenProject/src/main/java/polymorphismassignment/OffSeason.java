//Program to calculate discount , if customer purchase clothes on  OffSeason set discount as - 15%
// OnSeason - 40%
// Should use 2 classes - OnSeason and OffSeason
//Use 2 methods- discount(method name should be same)
 
package polymorphismassignment;
import java.util.*;

public class OffSeason {

	public void discount()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rate of the clothes (OffSeason) : ");
		double rate = sc.nextDouble();
		
		  double total = rate - (0.15d * rate);
		  System.out.println("Price after OffSeason discount is : "  + total);
	}

	
	}


