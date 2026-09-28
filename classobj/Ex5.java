package classobj;
class BankAccount{
	int balance;
	void deposit(int money) {
		balance=money+balance;
	}
	void withdraw(int amt) {
		
	}
}
class SavingsAccount extends BankAccount{
	void withdraw(int amt) {
		if(balance<100) {
			System.out.println("Insufficient Balance");
		}
		else {
			System.out.println("Account Updated:"+(balance-amt));
		}
	}
}
public class Ex5 {

	public static void main(String[] args) {
		
		SavingsAccount obj=new SavingsAccount();
		obj.deposit(99);
		obj.withdraw(1);
	}

}
