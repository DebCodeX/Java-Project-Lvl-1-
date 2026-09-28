package classobj;
class Employee{
	void work() {
		
	}
	void getSalary() {
		
	}
}
class HRManager extends Employee{
	void work() {
		System.out.println("Do Nothing...");
	}
	void addEmployee() {
		System.out.println("A new employee was hired..");
	}
}
public class Ex4 {

	public static void main(String[] args) {
		
		HRManager obj=new HRManager();
		obj.work();
		obj.addEmployee();

	}

}
