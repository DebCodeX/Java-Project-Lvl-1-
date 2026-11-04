package inheritance;
class Account{
	int Accno;
	String CustID;
	String BankID;
	String Branchname;
	double balance;
	double rate;

Account(int Accno,String CustID,String BankID,String Branchname,double balance,double rate){
	 this.Accno=Accno;
	this.CustID=CustID;
	 this.BankID=BankID;
	this.Branchname=Branchname;
	this.balance=balance;
	this.rate=rate;
	}
void display() {
	System.out.println("ACCOUNT DETAILS:");
	System.out.println();
	System.out.println("Account Number: "+Accno);
	System.out.println("Customer ID: "+CustID);
	System.out.println("Bank ID: "+BankID);
	System.out.println("Branch Name: "+Branchname);
	System.out.println("Available Balance: "+balance);
	System.out.println("Interest Rate: "+rate);
}
void calculateInterest() {
	
}
	
}
class FixedAccount extends Account{
	int time;
FixedAccount(int Accno,String CustID,String BankID,String Branchname,double balance,double rate,int time){
	super(Accno,CustID,BankID,Branchname,balance,rate);
	this.time=time;
}
void display() {
	System.out.println("FIXED ACCOUNT DETAILS:");
	System.out.println();
	System.out.println("Account Number: "+Accno);
	System.out.println("Customer ID: "+CustID);
	System.out.println("Bank ID: "+BankID);
	System.out.println("Branch Name: "+Branchname);
	System.out.println("Available Balance: "+balance);
	System.out.println("Interest Rate: "+rate);
	System.out.println("Time: "+time);
}
void calculateInterest() {
	double Interest;
	Interest=(balance*time*rate)/100;
	System.out.println("Total Interest: "+Interest);
	System.out.println("Total Balance: "+(balance+Interest));
}
}
class SavingsAccount extends Account{
SavingsAccount(int Accno,String CustID,String BankID,String Branchname,double balance,double rate){
		super(Accno,CustID,BankID,Branchname,balance,rate);
}
void display() {
	super.display();
}
void add(double amt) {
	balance=balance+amt;
	System.out.println("Updated Balance: "+balance);
}
void debt(double amt) {
	if(balance<amt) {
		System.out.println("Insufficient Balance");
	}
	else {
		balance=balance-amt;
		System.out.println("Updated Balance: "+balance);
	}
}
void calculateInterest() {
	balance=(balance*0.5*rate)/100;
}
}
class ReccuringAccount extends Account{
	double monthlyInvestment;
	int time;
ReccuringAccount(int Accno,String CustID,String BankID,String Branchname,double balance,double rate,double monthlyInvestment,int time){
		super(Accno,CustID,BankID,Branchname,balance,rate);
		this.monthlyInvestment=monthlyInvestment;
		this.time=time;
}
void display() {
	super.display();
}
void calculateInterest() {
	double Interest;
	Interest=(monthlyInvestment*rate*time)/100;
	System.out.println("Total Interest: "+Interest);
	System.out.println("Updated Balance: "+(balance+Interest));
}
}
public class Bank {

	public static void main(String[] args) {
		FixedAccount fd=new FixedAccount(458721754,"Debojit101","PUNB1705","Garden Reach",95000,8,2);
		fd.display();
		fd.calculateInterest();
		
		SavingsAccount obj= new SavingsAccount(784517466,"Kevin102","SBI5456","Bantala",50000,5.5);
		obj.display();
		obj.calculateInterest();
		obj.add(20000);
		obj.debt(1000);
		
		ReccuringAccount obj2=new ReccuringAccount(784517466,"Impala103","UCO5456","NJP",5000,6.5,12000,48);
		obj2.display();
		obj2.calculateInterest();
	}

}
