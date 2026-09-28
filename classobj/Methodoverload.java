package classobj;
class A{
	int x;
	int y;
	A(int c){
		x=y=c;
	}
	A(int c,int d){
		x=c;
		y=d;
	}
	int add() {
		return x+y;
	}
	int add(int f1,int f2) {
		return f1+f2;
	}
	int add(int f1) {
		return x+y+f1;
	}
	
}

public class Methodoverload {

	public static void main(String[] args) {
		
		A obj=new A(30);
		A obj2=new A(10,76);
		System.out.println(obj.add());
		System.out.println(obj.add(7));
		System.out.println(obj.add(98, 1));
		System.out.println(obj2.add(3, 87));
		System.out.println(obj2.add());
	}

}
