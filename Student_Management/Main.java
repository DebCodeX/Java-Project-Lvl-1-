package Student_Management;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Management obj=new Management();
		while(true){
			Scanner sc=new Scanner(System.in);
			System.out.println("1.Create a new Student ID\n2.Display Student Details\n3.Update Student Details\n4.Exit");
			System.out.println("Enter your choice: ");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				obj.addstudent();
				break;
			case 2:
				obj.studentlist();
				break;
			case 3:
				obj.update();
				break;
			case 4:
				System.exit(0);
			}
			
		}	
	}

}
