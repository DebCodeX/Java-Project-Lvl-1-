package classobj;
class Animal{
	void makeSound() {
		System.out.println("Meowwwwww");
	}
}
class Cat extends Animal{
	void makeSound() {
		System.out.println("Barking...");
	}
}
public class Ex1 {

	public static void main(String[] args) {
		
		//Cat obj1=new Cat();
		//obj1.makeSound();
		//Upcasting
		Animal obj2;
		obj2=new Cat();
		obj2.makeSound();
		
	}

}
