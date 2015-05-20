package oop03_inhertance;
class Car{
	String name= "자동차";
}
class HCar extends Car{
	String brand= "현대";
}

public class MemberVarExtendsDemo {
	public static void main(String[] args) {
		HCar h= new HCar();
		System.out.println(h.brand);
		System.out.println(h.name);
   	}
}
