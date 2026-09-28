package classobj;
class Anupam{
	int x=5;
	final int y=10;
	private int z=15;
	
	int getdata() {
		return z;
	}
	
	void show() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
class Biplob extends Anupam{
	int a;
	
}
public class Ex11 {

	public static void main(String[] args) {
		Anupam obj=new Anupam();
		//obj.show();
		//obj.getdata();
	}

}
