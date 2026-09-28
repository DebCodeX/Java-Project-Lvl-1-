package classobj;
import java.util.Scanner;
public class Ex10 {

	public static void main(String[] args) {
		int i;
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[7];
		for(i=0;i<arr.length;i++) {
			System.out.print("Enter The Elements: ");
			arr[i]=sc.nextInt();
		}
		for(i=arr.length-1;i>=0;i--) {
			System.out.println(" "+arr[i]);
		}
	}

}
