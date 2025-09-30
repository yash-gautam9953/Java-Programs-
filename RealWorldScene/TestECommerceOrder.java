class ECommerceOrder{

	String orderId;
	String customerName;
	String product;
	double price;
	boolean isDelivered;

	ECommerceOrder(){
		orderId = "";
		customerName = "";
		product = "";
		price = 0;
		isDelivered = false;
	}

	ECommerceOrder(String orderId,String customerName,String product ,  double price){

		this.orderId = orderId;
		this.customerName = customerName;
		this.product = product;
		this.price = price;

	}

	void displayOrderDetails(){

		System.out.println();
		System.out.println("Order ID : " + this.orderId);
		System.out.println("Customer Name : " + this.customerName);
		System.out.println("Product : " + this.product);
		System.out.println("Price : " + this.price);
		System.out.println("Delivered : " + this.isDelivered);
		System.out.println();
		
	}


	void applyDiscount(double persentage){

		this.price = this.price - this.price *(persentage/100);
		System.out.println();
		System.out.println();
		System.out.println("------------------------------------  AFTER APPLY DISCOUNT  --------------------------------");
		System.out.println();
		displayOrderDetails();
	}


	void markAsDelivered(){
		if(!isDelivered){
			this.isDelivered = true;
			System.out.println();
			System.out.println("------------------------------------ ORDER DELIVERED SUCCESSFUL  ---------------------------");
			displayOrderDetails();
		}
	}


}


class TestECommerceOrder{

	public static void main(String[] yash){

		ECommerceOrder o1 = new ECommerceOrder("1001","Yash Gautam","Laptop",62000);
		

		o1.displayOrderDetails();
		o1.applyDiscount(10);
		o1.markAsDelivered();
	}
}










