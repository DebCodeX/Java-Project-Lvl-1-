package resturant;

public class Food {

    int orderID;
    String foodname;
    double price;
    int quantity;

public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

Food(int orderID, String foodname, double price) {
        this.orderID = orderID;
        this.foodname = foodname;
        this.price = price;
    }

public int getOrderID() {
	return orderID;
}

public void setOrderID(int orderID) {
	this.orderID = orderID;
}

public String getFoodname() {
	return foodname;
}

public void setFoodname(String foodname) {
	this.foodname = foodname;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}
    
}