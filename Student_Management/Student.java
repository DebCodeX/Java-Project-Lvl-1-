package Student_Management;

public class Student {
	int stid;
	String name;
	String city;
	String strem;
	String dob;
	String email;
	int admiyear;
	static String college="Techno Bengal Institute Of Technology";
	
Student(int stid,String name,String city,String strem,String dob,String email,int admiyear){
		this.stid=stid;
		this.name=name;
		this.city=city;
		this.strem=strem;
		this.dob=dob;
		this.email=email;
		this.admiyear=admiyear;
	}

public int getStid() {
	return stid;
}

public void setStid(int stid) {
	this.stid = stid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getStrem() {
	return strem;
}

public void setStrem(String strem) {
	this.strem = strem;
}

public String getDob() {
	return dob;
}

public void setDob(String dob) {
	this.dob = dob;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public int getAdmiyear() {
	return admiyear;
}

public void setAdmiyear(int admiyear) {
	this.admiyear = admiyear;
}


}
