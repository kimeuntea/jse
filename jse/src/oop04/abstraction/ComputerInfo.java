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
		System.out.println("����ȸ�� : " + this.productCompany);
		System.out.println("��ǰ�� : " + this.productName);
		System.out.println("������ȣ : " + this.productSeriaID);
		System.out.println("cpu ���� : " + this.cpuInfo);
		System.out.println("���θ޸�: " + this.ramInfo);
		System.out.println("�ϵ��ũ ����: " + this.hddInfo);
	}
}
