//3. [Easy] Create a BankAccount class with private balance 
//and public deposit() and withdraw() methods.
package FinalTrainOOP;

public class BankAccount {
	private int balance;
	public void deposit(int d) {
		balance+=d;
	}
	public void withdraw(int w) {
		balance-=w;
	}
}
