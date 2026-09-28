package classobj;
class Person{
	String name;
	String Position;
	
	Person(String name,String Pos){
		this.name=name;
		Position=Pos;
	}
	
	void writting(Pen obj ) {
		System.out.println(name+" "+Position+" is writting with a "+obj.color+" "+obj.type+"pen");
	}
}

class Pen{
	String color;
	String type;
	
	Pen(String color,String type){
		this.color=color;
		this.type=type;
	}
}

public class Objpass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pen x1=new Pen("Black","Marker");
		Pen x2=new Pen("Blue","Ball");
		
		Person p1=new Person("Debojit","Goalkepper");
		Person p2=new Person("Luka","Midfielder");
		
		p1.writting(x1);
		p2.writting(x2);
		p1.writting(x2);
	
	}

}
