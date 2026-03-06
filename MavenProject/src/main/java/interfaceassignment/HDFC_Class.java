package interfaceassignment;

public class HDFC_Class implements RBI {

	public static void main(String[] args) {
		HDFC_Class object =  new HDFC_Class();
		object.recurringDeposit(6000, 5);

	}

	@Override
	public void recurringDeposit(double amount, int durationInYears) {
		// Compound interest formula: A = P * (1 + r)^t
		double maturityAmount = amount * Math.pow ((1 + interestRate),durationInYears);
        System.out.println("Deposit Amount: " + amount);
        System.out.println("Duration (Years): " + durationInYears);
        System.out.println("Maturity Amount after " + durationInYears + " years: " + maturityAmount);
    }

}	


		


	
		