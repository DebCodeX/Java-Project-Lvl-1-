package Student_Management;
import java.util.Scanner;
public class Management {
	int j=0;
	Student st[]=new Student[100];
	Scanner sc=new Scanner(System.in);
	void addstudent() {
		if(j<=100) {
		System.out.print("Enter The Student ID: ");
		int id = sc.nextInt();
		sc.next();
		System.out.print("Enter Student Name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter The City Name: ");
		String ct=sc.nextLine();
		
		System.out.print("Enter The Stream Name: ");
		String str=sc.nextLine();
		
		System.out.print("Enter The Date Of Birth: ");
		String db=sc.nextLine();
		
		System.out.print("Enter The Email ID: ");
		String em=sc.nextLine();
		
		System.out.print("Enter The Admission Year: ");
		int ay=sc.nextInt();
		
		st[j]=new Student(id,name,ct,str,db,em,ay);
		j++;
		}
		else {
			System.out.println("List is full");
		}
	}
	void studentlist() {
		int i;
		System.out.println("----------Student List----------");
		for(i=0;i<j;i++) {
			System.out.println("Student ID: "+st[i].stid);
			System.out.println("Student Name: "+st[i].name);
			System.out.println("Student's City Name: "+st[i].city);
			System.out.println("College Name: "+Student.college);
			System.out.println("Stream Name: "+st[i].strem);
			System.out.println("Student's D.O.B: "+st[i].dob);
			System.out.println("Student's Email ID: "+st[i].email);
			System.out.println("Admission Year: "+st[i].admiyear);
			System.out.println("-----------------------------------------------------");
		}
	}
	void update() {
		int index=0;
		System.out.print("Enter The Student ID: ");
		int a = sc.nextInt();
		
		System.out.println("1.Student Name");
		System.out.println("2.Student's City Name");
		System.out.println("3.Stream Name");
		System.out.println("4.Student's D.O.B");
		System.out.println("5.Student's Email ID");
		
		for(int i=0;i<st.length;i++) {
			if(a==st[i].stid) {
				index=i;
				break;
			}
		}
		
		System.out.println("What do you want to change: ");
		int ch=sc.nextInt();
		if(ch==1) {
			System.out.print("Enter Student Name: ");
			st[index].name=sc.nextLine();
		}
		else if(ch==2) {
			System.out.print("Enter The City Name: ");
			st[index].city=sc.nextLine();
		}
		else if(ch==3) {
			System.out.print("Enter The Stream Name: ");
			st[index].strem=sc.nextLine();
		}
		else if(ch==4) {
			System.out.print("Enter The Date Of Birth: ");
			st[index].dob=sc.nextLine();
		}
		else {
			System.out.print("Enter The Email ID: ");
			st[index].email=sc.nextLine();
		}
	}
}
