package abstractionassignment;

public class TestEmployee {

	public static void main(String[] args) {
		
		EmployeeAbstractClass object = new Contractor(500);
		 System.out.println("Contractor Salary: " + object.calculateSalary(10));

	        EmployeeAbstractClass object1 = new FullTimeEmployee(1000);
	        System.out.println("Full-Time Employee Salary: " + object1.calculateSalary(0));
	    }


		
	}