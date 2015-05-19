package oop01.syntax;

class MilkCoffee {
	int money;
	public void setMoney(int money) {
		this.money = money;
	}

	public MilkCoffee() {
		System.out.println("돈을 넣다");
	}

	public MilkCoffee(int money) {
		this();
		System.out.println(money + "물");
		
		
	}
	public MilkCoffee(int money, boolean exist) {
		this(money);
		System.out.println("구매가능여부 : " + (exist == true ? "커피종류선택" : "커피있음"));	
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}

public class CoffeeB {
/*
돈을 넣다
구매가능여부 :	커피종류 선택
나오는데 생성자를 한번ㅁㄴ
*/	
	public static void main(String[] args) {
		MilkCoffee coffee = new MilkCoffee(500, true);
		System.out.println(coffee);
		MilkCoffee cc = new MilkCoffee();
		cc=coffee;
		System.out.println(cc);
	}
}
