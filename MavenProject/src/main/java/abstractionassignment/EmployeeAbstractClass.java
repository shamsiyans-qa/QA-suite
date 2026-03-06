package abstractionassignment;

/* Let first create the superclass Employee and define a method called calculateSalary() as an abstract method.
 * The contractor class inherits all ppties from its parent employee,but have to provide its own implementation 
 of calculateSalary() method and multiply the value of payment per hour with given working hour.
 The FullTimeEmployee also has its own implementation of calculateSalary() method.
 In this case, we just multiply by constant 8 hours.*/

public abstract class EmployeeAbstractClass{
	
	double paymentPerHour;
	
	//constructor to set payment per hour :
	public EmployeeAbstractClass(double paymentPerHour) {
		this.paymentPerHour=paymentPerHour;
	}
	
	public abstract double calculateSalary(int workingHour);

}
