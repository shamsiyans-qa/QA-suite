package encapsulationassignment1;

//program to withdraw amount from ATM
 // CLASS1- Bank One method to set pin from USER class and validate PIN in another method 
 //VALID PINS -1001,1234,1212
 // PIN number should be declared as private
 // CLASS2- User Get the pin from USER


public class ParentPin {
private int pin;


public void setPin(int pin)
{
	this.pin = pin;
	}

public boolean validatePin() {
return(pin == 1001 || pin ==1234 || pin == 1212);
}

public void withdrawAmount(double amount)
{
	if(validatePin())
	{
	System.out.println("Pin is valid. Withdrawal of Rs " + amount + " Successful.");
	}
	else
	{
		System.out.println("INVALID PIN. Transaction Denied");
	}

}}