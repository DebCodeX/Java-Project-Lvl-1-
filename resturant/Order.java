package resturant;
import java.util.Scanner;
class Menucard{
	int count=0;
	int j=0;
	Food order[]=new Food[100];
	//int arr1[]=new int[100];
	//int arr[]=new int[100];
	double amount;
	Food menu[]={new Food(1,"Chicken Biriyani",120),
			new Food(2,"Mutton Biriyani  ",150),
			new Food(3,"Aloo Biriyani    ",100),
			new Food(4,"Panner Butter"
					+ " Masala",170),
			new Food(5,"Shahi Panner     ",180),
			new Food(6,"Panner Do "
					+ "Piyaza",180),
			new Food(7,"Chicken"
					+ " Butter Masala",250),
			new Food(8,"Chicken Bharta   ",210),
			new Food(9,"Kashmiri Pulao   ",180),
			new Food(10,"Chicken Tandoori",360),
			new Food(11,"Chicken Tikka "
					+ "Kabab",190),
			new Food(12,"Thai Soup        ",90),
			new Food(13,"Ice-Cream        ",60),
			new Food(14,"Coka-Cola         ",90),
			new Food(15,"Masala Pan        ",15)};
	
void displayMenu() {
	System.out.println("-------Menu-------");
	System.out.println("Food ID" +"\t    "+"Food Name" + "\t    " +   "    Price");
	int i;
	for(i=0;i<menu.length;i++) {
		System.out.println(menu[i].orderID +"\t"+ menu[i].foodname +"\t"+menu[i].price);
	}
}
void takeOrder() {
	Scanner sc= new Scanner(System.in);
	while(true) {
	System.out.print("Enter Order Id : ");
	int ch=sc.nextInt();
	order[j]=new Food(menu[ch-1].orderID,menu[ch-1].foodname,menu[ch-1].price);
	switch(ch){
	case 1:{
		System.out.println(menu[ch-1].foodname+"---"+menu[ch-1].price);
		break;
	}
	case 2:{
		System.out.println(menu[ch-1].foodname+"---"+menu[ch-1].price);
		break;
	}
	case 3:{
		System.out.println(menu[ch-1].foodname+"---"+menu[ch-1].price);
		break;
	}
	case 4:{
		System.out.println(menu[ch-1].foodname+"---"+menu[ch-1].price);
		break;
	}
	case 5:{
		System.out.println(menu[ch-1].foodname+"---"+menu[ch-1].price);
		break;
	}
	case 6:{
		System.out.println(menu[ch-1].foodname+"---"+menu[ch-1].price);
		break;
	}
	case 7:{
		System.out.println(menu[ch-1].foodname+"---"+menu[ch-1].price);
		break;
	}
	case 8:{
		System.out.println(menu[ch-1].foodname+"---"+menu[ch-1].price);
		break;
	}
	case 9:{
		System.out.println(menu[ch-1].foodname+"---"+menu[ch-1].price);
		break;
	}
	case 10:{
		System.out.println(menu[ch-1].foodname+"---"+menu[ch-1].price);
		break;
	}
	case 11:{
		System.out.println(menu[ch-1].foodname+"---"+menu[ch-1].price);
		break;
	}
	case 12:{
		System.out.println(menu[ch-1].foodname+"---"+menu[ch-1].price);
		break;
	}
	case 13:{
		System.out.println(menu[ch-1].foodname+"---"+menu[ch-1].price);
		break;
	}
	case 14:{
		System.out.println(menu[ch-1].foodname+"---"+menu[ch-1].price);
		break;
	}
	case 15:{
		System.out.println(menu[ch-1].foodname+"---"+menu[ch-1].price);
		break;
	}
	default:
		System.out.println("Invalid OrderId");
	}
	System.out.print("Enter The Quantity:");
	int num=sc.nextInt();
	order[j].setQuantity(num);
	j++;
	count++;
	System.out.println("Do You Want to order more: ");
	String a=sc.next();
	if(a.equalsIgnoreCase("N")) {
		break;
	}
	}
	}
void makeBill() {
	int k,i;
	double total=0;
	System.out.println("++++++++++++++++++++++++++++++ Your Bill ++++++++++++++++++++++++++++++");
	System.out.println();
	System.out.println("Id"+"\t"+"Name"+"\t"+"\t"+"       Quantity"+"\t"+"Price");
	for(i=0;i<count;i++) {
		for(k=0;k<menu.length;k++) {
			if(order[i].getOrderID()==menu[k].getOrderID()) {
				amount =menu[k].price*order[i].getQuantity();
				System.out.println(
	                    menu[k].orderID + "\t" +
	                    menu[k].foodname + "\t" +
	                  order[i].getQuantity() + "\t" +
	                    amount
	                );
				total=total+amount;
			}
		}
		System.out.println("-----------------------------------------------------------------------");
	}
	System.out.println("Total                                   "+total);
	System.out.println("-----------------------------------------------------------------------");
	System.out.println("################### Thank You!!!!! ###################");
}
}

	


