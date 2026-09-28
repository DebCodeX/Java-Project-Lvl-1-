package classobj;
class Shape2D{
double dim1;
double dim2;
double c;
Shape2D(){
System.out.println("Constructor Created Successfully");
}
Shape2D(double x, double y){
	dim1=x;
	dim2=y;
}
Shape2D(double x){
	dim1=dim2=x;
}
//Shape2D(Shape2D obj){
	//dim1=obj.dim1;
	//dim2=obj.dim2;
//}
void area() {
	this.c=this.dim1*this.dim2;
}
void display() {
	//System.out.println(dim1);
	//System.out.println(dim2);
	area();
	System.out.println("The Area of the Shape is: "+this.c);
}
}
class Shape{
public static void main(String args[]){
    Shape2D box1=new Shape2D();
    Shape2D box2=new Shape2D(7.5,9.5);
    Shape2D box3=new Shape2D(5.5);
    //Shape2D box4=new Shape2D(box2);
    Shape2D box4;
    box4=box2;
    box2.display();
    box3.display();
    box4.display();
    
}
}