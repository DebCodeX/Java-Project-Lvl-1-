package classobj;
class Employee1{
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance=250.80;
	double hra=1000.50;
	
Employee1(long Id,String Name,String address,long phone){
	
	employeeId=Id;
	employeeName=Name;
	employeeAddress=address;
	employeePhone=phone;
}

	void calculateSalary() {
		double salary;
		salary=basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*hra/100);
		System.out.println(salary);
		
	}
	
	void calculateTransportAllowance() {
		double transportAllowance;
		transportAllowance =  basicSalary *0.10;
		System.out.println(transportAllowance);
	}
	
}
class Manager extends Employee1{

Manager(long Id,String Name,String address,long phone,double salary){
	super(Id,Name,address,phone);
	basicSalary=salary;
}

	void calculateTransportAllowance() {
		double transportAllowance;
		transportAllowance =basicSalary *0.15;
		System.out.println(transportAllowance);
	}
}
class Trainee extends Employee1{
Trainee(long Id,String Name,String address,long phone,double salary){
	super(Id,Name,address,phone);
	basicSalary=salary;
}
}
public class Ex6 {

	public static void main(String[] args) {
		
		Manager obj=new Manager(126534,"Peter","Chennai",237844,65000);
		obj.calculateSalary();
		obj.calculateTransportAllowance();
		Trainee obj1=new Trainee(29846,"Jack","Mumbai",442085,45000);
		obj1.calculateSalary();
		obj1.calculateTransportAllowance();
}

}
