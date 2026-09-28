package classobj;
interface Device{
	void operate();
}
interface Light extends Device{
	public void operate();
}
interface Fan extends Device{
	public void operate1();	
}
class Smart implements Fan,Light{

	public void operate() {
		System.out.println("Light is turned ON");
		
	}
	public void operate1() {
		System.out.println("Fan is turned ON");
	}
	
}
public class Diamond {

	public static void main(String[] args) {
		Smart sm=new Smart();
		sm.operate();
		sm.operate1();
	}

}
