package setandget;

import java.util.Scanner;


public class Week3question {

	public static void main(String[] args) {
		week3 account1 = new week3("Berk kiyi",95.00 );
		week3 account2 = new week3("Sena Kiyi",50.00 );
		
		
		System.out.printf("%s balance: $%.2f%n",
		account1.getname(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n",
		account2.getname(),account2.getBalance());
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("enter deposit amount for account1: ");
		double depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account1 balance %n%n",depositAmount);
		account1.deposit(depositAmount);
		
		//display balances
		
		System.out.printf("%s balance: $%.2f%n",
		account1.getname(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n",
		account2.getname(), account2.getBalance());
		
		System.out.print("Enter deposit amount for account2: ");
		depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account 2 balance%n%n",
		depositAmount);
		account2.deposit(depositAmount);
		System.out.printf("%s balance: $%.2f%n",
		account1.getname(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n",
		account2.getname(), account2.getBalance());
	}
}
