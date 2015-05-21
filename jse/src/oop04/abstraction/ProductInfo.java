package oop04.abstraction;

public abstract class ProductInfo {
	protected String productCompany;
	protected String productName;
	protected String productSeriaID;

	public void setProductInfo(String productCompany, String productName,
			String productSeriaID) {
		this.productCompany = productCompany;
		this.productName = productName;
		this.productSeriaID = productSeriaID;
	}
	public abstract void displayProductInfo();

}
