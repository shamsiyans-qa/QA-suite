package interfaceassignment;

/*Write a Program where RBI will be an Interface, have a method - recurringDeposit which can accept the amount & Duration
 * This must be implemented in class HDFC.
 * When a customer deposit amount in HDFC, They must be able to know how much amount they will get after depositing for n period of time.
 Interest rate is defined in RBI INTERFACE*/

public interface RBI {

	double interestRate = 0.06; //6% annual interest rate 
	public abstract void recurringDeposit(double amount,int durationInYears);
}
