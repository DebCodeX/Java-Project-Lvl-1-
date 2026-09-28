package classobj;

import java.util.Scanner;

class Solve{
	int a,b,c;
	float d;
Solve(int x,int y){
	a=x;
	b=y;
}
void add() {
	c=a+b;
	System.out.println("The Addition of "+a+" and "+b+" is : "+c);
}
void sub() {
	c=a-b;
	System.out.println("The Substraction of "+a+" and "+b+" is : "+c);	
}
void mul() {
	c=a*b;
	System.out.println("The Multiplication of "+a+" and "+b+" is : "+c);
}
void div() {
	if(b!=0) {
		d=(float)a/(float)b;
		System.out.println("The Division of "+a+" and "+b+" is :"+d);
	}
	else {
		System.out.println("A number is can't divided by zero");
	}
}
}
public class Calculator {

	public static void main(String[] args) {
		do {
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Exit");
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Choice: ");
		int ch=sc.nextInt();
		
		System.out.println("Enter First Number: ");
		int f1=sc.nextInt();
		System.out.println("Enter Second Number: ");
		int f2=sc.nextInt();
		
		Solve obj=new Solve(f1,f2);
		
		switch(ch) {
		
		case 1:
		obj.add();
		break;
		case 2:
		obj.sub();
		break;
		case 3:
		obj.mul();
		break;
		case 4:
		obj.div();
		break;
		case 5:
		System.exit(0);
		}
	}while(true);
	}

}
