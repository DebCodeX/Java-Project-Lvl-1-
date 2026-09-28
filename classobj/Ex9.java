package classobj;
import java.util.Scanner;
public class Ex9 {

	public static void main(String[] args) {
		int i,max,min;
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		for(i=0;i<arr.length;i++) {
		System.out.print("Enter The Elements: ");
		arr[i]=sc.nextInt();
		}
		max=arr[0];
		min=arr[0];
		for(i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			else {
				max=arr[i];
			}
		}
		System.out.println("The Maximum Element in the Array: "+max);
		System.err.println("The Minimum Element in the Array: "+min);
	}

}
