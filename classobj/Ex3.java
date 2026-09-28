package classobj;
class Shape2{
	void getArea() {
		
	}
}
class Rectangle extends Shape2{
	double length;
	double width;
Rectangle(double length,double width){
	this.length=length;
	this.width=width;
}
	void getArea() {
		System.out.println("The Area of Rectangle: "+(length*width));
	}
}
public class Ex3 {

	public static void main(String[] args) {
		
		Rectangle obj1=new Rectangle(9.4,6.5);
		obj1.getArea();

	}

}
