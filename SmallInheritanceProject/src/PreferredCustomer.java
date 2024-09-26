
public class PreferredCustomer extends Customer {
	
	private double discountLevel;
	private double purchaseAmount;
	
	public PreferredCustomer(){
		setDiscountLevel(0);
		setPurchaseAmount(0);
	}
	
	public PreferredCustomer(double DL, double PA) {
		setDiscountLevel(DL);
		setPurchaseAmount(PA);
	}
	
	/**
	 * Allows the customer to purchase an item with their discount amount
	 * @param amt
	 */
	
	public void makePurchase(double amt) {
		double total = amt * (1 - discountLevel);
		purchaseAmount += total;
		System.out.println("Purchased item for " + (double)Math.round(total) + " after a " + (int)(discountLevel * 100) + "% discount");
		updateDiscountTier();
	}
	
	/**
	 * updates the customer's discount tier based on the total amount they've spent
	 */
	
	public void updateDiscountTier() {
		
		if(purchaseAmount >= 2000) {
			discountLevel = 0.10;
		}else if(purchaseAmount >= 1500) {
			discountLevel = 0.07;
		}else if(purchaseAmount >= 1000) {
			discountLevel = 0.06;
		}else if(purchaseAmount >= 500) {
			discountLevel = 0.05;
		}else {
			discountLevel = 0;
		}
		
	}

	public double getDiscountLevel() {
		return discountLevel;
	}

	public void setDiscountLevel(double discountLevel) {
		this.discountLevel = discountLevel;
	}

	public double getPurchaseAmount() {
		return purchaseAmount;
	}

	public void setPurchaseAmount(double purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
	}
	
	
	
}
