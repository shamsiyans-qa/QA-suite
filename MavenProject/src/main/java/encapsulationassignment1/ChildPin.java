package encapsulationassignment1;
import java.util.Scanner;
public class ChildPin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ParentPin object = new ParentPin();
		
		
		System.out.print("Enter your PIN: ");
        int enteredPin = sc.nextInt();
        object.setPin(enteredPin);

        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        object.withdrawAmount(amount);

        sc.close();
    }

}
