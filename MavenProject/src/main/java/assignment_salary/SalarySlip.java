package assignment_salary;

public class SalarySlip extends TotalSalary {
	
	 public void displaySlip() {
		 
	        System.out.println("\n------ Salary Slip ------");
	        System.out.println("Basic Pay   : " + basicPay);
	        System.out.println("Deduction   : " + deduction);
	        System.out.println("HRA (5%)    : " + hra1);
	        System.out.println("PF (20%)    : " + pf1);
	        System.out.println("Bonus       : " + bonus);
	        System.out.println("-------------------------");
	        System.out.println("Total Salary: " + totalSalary);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SalarySlip object = new SalarySlip();
       
        object.display();
        object.salary();
        object.salary1();
        object.displaySlip();
    }

	}


