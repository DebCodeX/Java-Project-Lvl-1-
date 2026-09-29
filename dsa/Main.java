package dsa;
import java.util.Scanner;
interface Stack{
	void push(int data);
	int pop();
}
class Fixed implements Stack{
	int size;
	int top;
	int stack[];
Fixed(int size){
	this.size=size;
	top=-1;
	stack=new int[size];
}
public void push(int data) {
	if(top==size-1) {
		System.out.print("Stack Overflow!!");
	}
	else {
		stack[++top]=data;
		System.out.println(data+" pushed in Stack");
	}
}
	public int pop() {
		if(top==-1) {
			System.out.println("Stack Underflow!!");
			return -1;
		}
		return stack[top--];
	}
	
	void display(){
		int i;
		for(i=top;i>=0;i--){
			System.out.print(" "+stack[i]);
		}
	}
}
class Dynamic implements Stack{
	int size;
	int top;
	int stack[];
Dynamic(int size){
	this.size=size;
	top=-1;
	stack=new int[size];
}
int data;
int dstack[];
public void push(int data) {
	int i;
	if(top==size-1) {
		System.out.println("After Expanding...");
		dstack=new int[size*2];
		for(i=0;i<=top;i++) {
			dstack[i]=stack[i];
		}
		stack=dstack;
	}
	stack[++top]=data;
	System.out.println(data+" pushed in Stack");
}
public int pop() {
	if(top==-1) {
		System.out.println("Stack Underflow!!");
		return -1;
	}
	return stack[top--];
}
void display(){
	int i;
	for(i=top;i>=0;i--){
		System.out.print(" "+stack[i]);
	}
}
}
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Fixed S1=new Fixed(3);
		Dynamic S2 =new Dynamic(3);
		System.out.println("----Stack Menu----");
		System.out.println("\n1.Fixed Stack\n2.Dynamic Stack\n");
		System.out.print("Enter A Choice: ");
		int ch=sc.nextInt();
		if(ch==1) {
			while(true) {
			System.out.println("\n1.Push\n2.Pop\n3.Display\n4.Exit\n");
			System.out.print("Enter A Choice: ");
			int fs=sc.nextInt();
			switch(fs) {
			case 1:
				int data;
				System.out.print("Enter A Data: ");
				data=sc.nextInt();
				S1.push(data);
				break;
			case 2:
				System.out.println("Pooped Element: "+S1.pop());
				break;
			case 3:
				S1.display();
				break;
			case 4:
				System.exit(0);
			}
		}
		}
		else {
			while(true) {
			System.out.println("\n1.Push\n2.Pop\n3.Display\n4.Exit\n");
			System.out.print("Enter A Choice: ");
			int ds=sc.nextInt();
			switch(ds) {
			case 1:
				int data;
				System.out.print("Enter A Data: ");
				data=sc.nextInt();
				S2.push(data);
				break;
			case 2:
				System.out.println("Pooped Element: "+S2.pop());
				break;
			case 3:
				S2.display();
				break;
			case 4:
				System.exit(0);
			}
		}
		
	}

}
}