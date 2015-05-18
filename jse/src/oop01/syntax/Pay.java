package oop01.syntax;

public class Pay {
	
	static final double TAX=0.1;
	 String name;
	 int salary;

	public static void main(String[] args) {
		Pay pay= new Pay();
		
		
		pay.name = "헐크";
		pay.salary = 334;
		System.out.println("==="+pay.name +"의 5월달 실급여는" +(int)(pay.salary-(pay.salary*TAX))+ "만원입니다.");
	
		pay.name = "아이언";
		pay.salary = 556;
		System.out.println("==="+pay.name+"의 5월달 실급여는"+(int)(pay.salary-(pay.salary*TAX))+"만원입니다.");
		
		pay.name = "토르";
		pay.salary = 112;
		System.out.println("==="+ pay.name+"의 5월달 실급여는"+(int)(pay.salary-(pay.salary*TAX))+"만원입니다.");
		
	
	
	
	
	
	
	}
}
