package Library_College;
abstract class SmartDevice{
	abstract void operate();
	void DeviceStatus() {
		
	}
}
class AirConditioner extends SmartDevice{
	void DeviceStatus() {
		System.out.println("The Air-Conditioner is turned ON");
	}
	
	void operate(){
		System.out.println("It is cooling the room");
	}
}
class SmartTV extends SmartDevice{
	void DeviceStatus() {
		System.out.println("Smart TV is turned ON");
	}
	void operate() {
		System.out.println("It is playing a Sports Channel");
	}
}
public class Main1 {

	public static void main(String[] args) {
		AirConditioner obj1=new AirConditioner();
		obj1.DeviceStatus();
		obj1.operate();
		
		SmartTV obj2 =new SmartTV();
		obj2.DeviceStatus();
		obj2.operate();

	}

}
