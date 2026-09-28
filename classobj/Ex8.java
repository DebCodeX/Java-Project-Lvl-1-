package classobj;
import java.util.Scanner; 
public class Ex8 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int arr[]=new int[5];
		int i;
		for(i=0;i<arr.length;i++) {
			System.out.print("Enter The Elements: ");
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter A Number: ");
		int a=sc.nextInt();
		for(i=0;i<arr.length;i++) {
			if(arr[i]!=a) {
				System.out.println("Element Not Found");
			}
			else {
				System.out.println("Element found At " +(i+1)+ " Position");
				break;
			}
		}
	}

}
