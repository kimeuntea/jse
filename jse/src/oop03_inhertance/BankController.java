package oop03_inhertance;

public class BankController {
	public static void main(String[] args) {
   BankAccount bankAccount = new BankAccount();
   bankAccount.setAccount("123456", "123", "��ũ", 100);
   bankAccount.printAccount();
   bankAccount.deposit(100);
   bankAccount.printAccount();
   bankAccount.defrayment(300);
   bankAccount.printAccount();
   
   MinusAccount minusAccount = new MinusAccount();
   minusAccount.setAccount("123456", "123", "���̾�", 100);
   minusAccount.printAccount();
   minusAccount.deposit(100);
   minusAccount.printAccount();
   minusAccount.defrayment(300);
   minusAccount.printAccount();
   minusAccount.defrayment(500);
   minusAccount.printAccount();
	}
}
