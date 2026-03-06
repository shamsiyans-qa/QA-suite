package abstractionassignment;

public class FullTimeEmployee extends EmployeeAbstractClass{

	public FullTimeEmployee(double paymentPerHour) {
		super(paymentPerHour);
		
	}

	

	@Override
	public double calculateSalary(int workingHour) {
		
		return paymentPerHour * 8;
	}

}
