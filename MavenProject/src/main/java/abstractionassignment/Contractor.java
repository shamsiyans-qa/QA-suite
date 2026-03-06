package abstractionassignment;

public class Contractor extends EmployeeAbstractClass {

	

	public Contractor(double paymentPerHour) {
		super(paymentPerHour);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public double calculateSalary(int workingHour) {
		
		return paymentPerHour * workingHour;
	}}


