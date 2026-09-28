package classobj;
class Shape3D{
	String shape;
	
	Shape3D(String a){
		shape=a;
	}
	
	void volume(double a) {
		if(shape.equals("Cube")) {
			System.out.println("The Volume Of the Cube is: "+(a*a*a));
		}
		else {
			System.out.println("The Volume of the Sphere: "+((1.33333)*3.14*(a*a*a)));
		}
	}
		void volume(double r,double h) {
			
			if(shape.equals("Cone")) {
				System.out.println("The Volume of the Cone is: "+((0.333)*(3.14)*(r*r)*h));
			}
			else {
				System.out.println("The Volume of the Cylinder is: "+((3.14)*(r*r)*h));
			}
		}
		
		void volume(double l,double w,double h) {
			
			 {
				System.out.println("The Volume of the Cuboid is: "+(l*w*h));
			}


}	
}

public class Shapett {

	public static void main(String[] args) {
		Shape3D obj1=new Shape3D("Cube");
		obj1.volume(5.5);
		
		Shape3D obj2=new Shape3D("Sphere");
		obj2.volume(7.5);
		
		Shape3D obj3=new Shape3D("Cone");
		obj3.volume(4.2,1.75);
		
		Shape3D obj4=new Shape3D("Cylinder");
		obj4.volume(4,8);
		
		Shape3D obj5=new Shape3D("Cuboid");
		obj5.volume(7,5.9,6.3);

	}

}
