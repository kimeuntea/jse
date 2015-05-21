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
		System.out.println(this.accountNum + "가 개설되엇습니다.");
	}

	public void defrayment(int pay) {

		if (this.balance + this.minusLimit >= pay) {
			this.balance = this.balance - pay;
			System.out.println(pay + "만원을 출금햇습니다.");
		} else {
			System.out.println("잔액이 부족합ㄴ다.");
		}
    
	}

	public void printAccount() {
		System.out.println("(마이너스 통장)계좌번호 : " + this.accountNum);
		System.out.println("예 금 주 :" + this.ownerName);
		System.out.println("계좌잔액" +this.balance);

	}
}
