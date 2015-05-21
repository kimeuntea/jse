package oop04.abstraction;

public class ComputerInfo extends ProductInfo {
	protected String cpuInfo;
	protected String ramInfo;
	protected String hddInfo;

	public void setComputerInfo(String productCompany, 
			String productName,
			String productSeriaID,
			String cpuInfo,
			String ramInfo, 
			String hddInfo) {
		super.setProductInfo(productCompany, productName, productName);
		this.cpuInfo = cpuInfo;
		this.ramInfo = ramInfo;
		this.hddInfo = hddInfo;
	}

	@Override
	public void displayProductInfo() {
		// TODO Auto-generated method stub
		System.out.println("제조회사 : " + this.productCompany);
		System.out.println("제품명 : " + this.productName);
		System.out.println("고유번호 : " + this.productSeriaID);
		System.out.println("cpu 정보 : " + this.cpuInfo);
		System.out.println("메인메모리: " + this.ramInfo);
		System.out.println("하드디스크 정보: " + this.hddInfo);
	}
}
