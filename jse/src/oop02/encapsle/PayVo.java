package oop02.encapsle;

public class PayVo {
	String name;
    int salary;
    static final double TAX=0.1;
    int income;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	public static double getTax() {
		return TAX;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}

    
}
