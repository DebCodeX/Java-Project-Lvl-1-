package Library_College;
import java.util.Scanner;
class Book{
	String bookname;
	String authname;
	String publiname;
	int price;
	
Book(String bookname,String authname,String publiname,int price){
	this.bookname=bookname;
	this.authname=authname;
	this.publiname=publiname;
	this.price=price;
}
}
class Library{
	Book bk[];
	Scanner sc=new Scanner(System.in);
	Scanner sc1=new Scanner(System.in);
	void input() {
		System.out.print("Enter The Size Of the Library: ");
		int len=sc.nextInt();
		bk=new Book[len];
		for(int i=0;i<len;i++) {
			System.out.print("Enter The Book Name: ");
			String name=sc1.nextLine();
			
			System.out.print("Enter The Author Name: ");
			String auth=sc1.nextLine();
			
			System.out.print("Enter The Publisher Name: ");
			String publi=sc1.nextLine();
	
			System.out.print("Enter The Price: ");
			int amt=sc.nextInt();
			
			bk[i]=new Book(name,auth,publi,amt);
		}
	}
	
void search(int amt) {
	int i=0,flag=0;
while(i<bk.length) {
	if(bk[i].price<=amt) {
		flag=1;
		System.out.println("The Book Found in the given range is: "+bk[i].bookname);
	}
	i++;
}
if(flag==0) {
	System.out.println("No book found in the given price range");
}
}

void search(int amt,String pname) {
	int i=0,flag=0;
	while(i<bk.length) {
		if(bk[i].price<=amt && bk[i].publiname.equals(pname)) {
			flag=1;
			System.out.println("Book found with the given price and publisher: "+bk[i].bookname);
		}
		i++;
	}
	
if(flag==0) {
	System.out.println("Book not found");
}
}

void search(int amt,String author,String pubname) {
	int i=0,flag=0;
	while(i<bk.length) {
		if(bk[i].price<=amt && bk[i].authname.equals(author) && bk[i].publiname.equals(pubname)) {
			flag=1;
			System.out.println("Book found with the given price, author and publisher: " +bk[i].bookname);
		}
		i++;
	}
if(flag==0) {
		System.out.println("Book not found");
	}
}
}
public class Main {

	public static void main(String[] args) {
		Library obj=new Library();
		obj.input();
		obj.search(500);
		obj.search(350, "Ananda Publishers");
		obj.search(500, "Shirshendu Mukhopadhyay", "Ananda Publishers");
	}

}
