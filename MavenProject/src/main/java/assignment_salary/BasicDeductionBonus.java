package assignment_salary;

//Program to find the total salary by hand of an employee
/** Class1 - Get basic pay,deduction and bonus from console
* Class2 - Calculate HRA (5% basic pay)& PF(20% OF Basic pay)
* Class3 - Find the total salary (Basic+HRA-PF-Deduction+Bonus)
* Class4 -  Salary slip should contain basic pay,deduction,HRA,PF,Bonus,total salary by hand
*/

import java.util.Scanner;

public class BasicDeductionBonus {
	

	float basicPay,deduction,bonus;
	public void display()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Basic Pay : " );
		basicPay = sc.nextFloat();
		
		System.out.println("Enter Deduction : ");
		deduction = sc.nextFloat();
		
		System.out.println("Enter Bonus : ");
		bonus = sc.nextFloat();
		
	}}