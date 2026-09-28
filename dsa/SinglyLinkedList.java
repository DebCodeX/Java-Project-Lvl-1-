package DSA;
import java.util.Scanner;
class Node{
	int data;
	Node next ;
}
class LinkedList{
	Node head=null;
	Scanner sc=new Scanner(System.in);
void insertAtend(){
	Node n,temp;
	n=new Node();
	System.out.print("Enter The data: ");
	n.data=sc.nextInt();
	n.next=null;
	if(head==null) {
		head=n;
	}
	else {
		temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=n;
	}
}
void insertAtfront() {
	Node n,temp;
	n=new Node();
	System.out.print("Enter The Data: ");
	n.data=sc.nextInt();
	n.next=null;
	if(head==null) {
		head=n;
	}
	else {
		n.next=head;
		head=n;
	}
}
void deleteAtend() {
	Node temp,temp2;
	if(head==null) {
		System.out.println("The List is Empty");
	}
	else if(head.next==null){
		head=null;
	}
	else {
		temp=head;
		temp2=head;
		while(temp.next!=null) {
			temp2=temp;
			temp=temp.next;
		}
		temp=null;
		temp2.next=null;
	}
}
void deleteAtfront() {
	Node temp;
	if(head==null) {
		System.out.println("The List is Empty");
	}
	else {
		temp=head;
		head=head.next;
		temp=null;
	}
}
void display() {

    Node temp = head;

    if (head == null) {
        System.out.println("The List is Empty");
    }
    else {
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}

}