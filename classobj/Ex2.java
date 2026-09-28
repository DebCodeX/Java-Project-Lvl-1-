package classobj;
class Vehicle{
	void drive() {
		
	}
}
class Car extends Vehicle{
	void drive() {
		System.out.println("Repairing a car");
	}
}
public class Ex2 {

	public static void main(String[] args) {
		
		Car obj1=new Car();
		obj1.drive();
	}

}
