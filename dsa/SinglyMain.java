package DSA;
import java.util.Scanner;
public class Main1 {

	public static void main(String[] args) {
		int ch;
		LinkedList obj=new LinkedList();
		Scanner sc=new Scanner(System.in);
	 	do{
	 		System.out.print("\n--Singly Linked List Menu--\n");
	 	System.out.print("\n1.Insert At Front\n2.Insert At End\n3.Delete At End\n4.Delete At Front\n5.Display\n6.Exit\n");
	 	System.out.print("Enter your choice: "); 
	 	ch=sc.nextInt();
	 	switch(ch)
		{
			case 1:
				obj.insertAtfront();
				break;
			case 2:
				obj.insertAtend();
				break;
	        case 3:
				obj.deleteAtend();
				break;
	            case 4:
				obj.deleteAtfront();
				break;
			case 5:
				obj.display();
				break;
			case 6:
				System.exit(0);
			default:System.out.print("Error!!!!!");
		}
		}while(true);
	}

}
