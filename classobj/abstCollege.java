package classobj;
abstract class Shape3d{
	double dim1;
	double dim2;
	double volume;
	Shape3d(double dim1,double dim2){
		this.dim1=dim1;
		this.dim2=dim2;
	}
	Shape3d(double dim1){
		this.dim1=dim1;
	}
	
	abstract void findvol();
	
	void display() {
		System.out.println("The volume: "+volume);
	}
}
class Sphere extends Shape3d{
	Sphere(double dim1){
		super(dim1);
	}
	void findvol() {
		volume=(1.33333*3.14*dim1*dim1);
	}
}

class Cone extends Shape3d{
	Cone(double dim1,double dim2){
		super(dim1,dim2);
	}
	void findvol() {
		volume=(0.33333*3.14*dim1*dim1*dim2);
	}
}

class Cylinder extends Shape3d{
	Cylinder(double dim1,double dim2){
		super(dim1,dim2);
	}
	void findvol() {
		volume=(3.14*dim1*dim1*dim2);
	}
	
}
class Cube extends Shape3d{
	Cube(double dim1){
		super(dim1);
	}
	void findvol() {
		volume=(dim1*dim1*dim1);
	}
	
}
public class abstCollege {

	public static void main(String[] args) {
		Sphere obj =new Sphere(8);
		obj.findvol();
		obj.display();

	}

}
