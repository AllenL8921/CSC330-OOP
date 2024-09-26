
public class CustomerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PreferredCustomer cust1 = new PreferredCustomer();
		
		cust1.makePurchase(100);
		cust1.makePurchase(500);
		
		System.out.println("Total Purchased: " + cust1.getPurchaseAmount());

		cust1.makePurchase(500);
		cust1.makePurchase(500);

		System.out.println("Total Purchased: " + cust1.getPurchaseAmount());
		
		cust1.makePurchase(100);
		cust1.makePurchase(1000);
		
		System.out.println("Total Purchased: " + cust1.getPurchaseAmount());
		cust1.makePurchase(1000);


	}

}
/*OUTPUT
Purchased item for 100.0 after a 0% discount
Purchased item for 500.0 after a 0% discount
Total Purchased: 600.0
Purchased item for 475.0 after a 5% discount
Purchased item for 470.0 after a 6% discount
Total Purchased: 1545.0
Purchased item for 93.0 after a 7% discount
Purchased item for 930.0 after a 7% discount
Total Purchased: 2568.0
Purchased item for 900.0 after a 10% discount
*/