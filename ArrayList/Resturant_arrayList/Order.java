package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
 class Menucard{
	 int j=0;
	 int count=0;
	 double amount;
	 ArrayList<Food>order=new ArrayList<Food>();
	 ArrayList<Food> menu = new ArrayList<Food>();
	 Menucard(){
	 menu.add(new Food(1, "Chicken Biriyani", 120));
	 menu.add(new Food(2,"Mutton Biriyani  ",150));
	 menu.add(new Food(3,"Aloo Biriyani    ",100));
	 menu.add(new Food(4,"Panner Butter"
				+ " Masala",170));
	 menu.add(new Food(5,"Shahi Panner     ",180));
	 menu.add(new Food(6,"Panner Do "
				+ "Piyaza",180));
	 menu.add(new Food(7,"Chicken"
				+ " Butter Masala",250));
	 menu.add(new Food(8,"Chicken Bharta   ",210));
	 menu.add(new Food(9,"Kashmiri Pulao   ",180));
	 menu.add(new Food(10,"Chicken Tandoori",360));
	 menu.add(new Food(11,"Chicken Tikka "
				+ "Kabab",190));
	 menu.add(new Food(12,"Thai Soup        ",90));
	 menu.add(new Food(13,"Ice-Cream        ",60));
	 menu.add(new Food(14,"Coka-Cola         ",90));
	 menu.add(new Food(15,"Masala Pan        ",15));
	 }
  void displayMenu() {
	System.out.println("-------Menu-------");
    System.out.println("Food ID" +"\t    "+"Food Name" + "\t    " +   "    Price");
	int i;
	   for(i=0;i<menu.size();i++) {
		 System.out.println(menu.get(i).orderID +"\t"+ menu.get(i).foodname +"\t"+menu.get(i).price);
			}
		}
  
void takeOrder() {
      Scanner sc = new Scanner(System.in);
      while (true){
	  System.out.print("Enter Order Id: ");
	  int ch = sc.nextInt();
	  order.add(new Food(menu.get(ch-1).orderID,menu.get(ch-1).foodname,menu.get(ch-1).price));
	  System.out.println(menu.get(ch-1).foodname+"---"+menu.get(ch-1).price);
	        System.out.print("Enter The Quantity: ");
	        int num = sc.nextInt();
	        order.get(j).setQuantity(num);
	        j++;
	        count++;
	        System.out.println("Do You Want to order more? ");
	        String a = sc.next();
	        if (a.equalsIgnoreCase("N")) {
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
		for(k=0;k<menu.size();k++) {
			if(order.get(i).getOrderID()==menu.get(k).getOrderID()) {
				amount =menu.get(k).price*order.get(i).getQuantity();
				System.out.println(
	                    menu.get(k).orderID + "\t" +
	                    menu.get(k).foodname + "\t" +
	                    order.get(i).getQuantity() + "\t" +
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
