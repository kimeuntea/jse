package oop03_inhertance;

public class MinusAccount extends BankAccount {
	private int minusLimit;

	public void setAccount(String accountNum, String accountPass,
			String ownerName, int pay, int minus) {
		this.accountNum = accountNum;
		this.accountPass = accountPass;
		this.ownerName = ownerName;
		this.balance = pay;
		this.minusLimit = minus;
		System.out.println(this.accountNum + "�� �����Ǿ����ϴ�.");
	}

	public void defrayment(int pay) {

		if (this.balance + this.minusLimit >= pay) {
			this.balance = this.balance - pay;
			System.out.println(pay + "������ ����޽��ϴ�.");
		} else {
			System.out.println("�ܾ��� �����դ���.");
		}
    
	}

	public void printAccount() {
		System.out.println("(���̳ʽ� ����)���¹�ȣ : " + this.accountNum);
		System.out.println("�� �� �� :" + this.ownerName);
		System.out.println("�����ܾ�" +this.balance);

	}
}
