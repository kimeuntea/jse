package cmm03.flow;

import java.util.Scanner;

public class No07_kaup {

	double height;
	double weight;
	int idx;
	Scanner scanner = new Scanner(System.in);
	No07_kaup() {
		this(0,0);
	}
	No07_kaup(double i,double j) {
		// TODO Auto-generated constructor stub
		this.height = i;
		this.weight = j;
		this.idx = (int) ((weight/(height*height))*10000);
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = scanner.nextDouble();
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = scanner.nextDouble();
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
     String getMsg(){
		String msg ="";
		if(idx>30){msg = "비만";}
		else if(idx>24){msg = "과체중";}
		else if(idx>20){msg = "정상";}
		else if(idx>15){msg = "저체중";}
		else if(idx>13){msg = "마름";}
		else if(idx>10){msg = "영양실조";}
		else{msg = "소모증";}
		return msg;
	}
	@Override
	public String toString() {
		return "카우프지수 No07_kaup [키=" + height +"cm "+ ", 몸무게=" + weight +"kg"+", 카우프지수="
				+ getMsg() + "]";
	}
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("키를 입력하시오");
		double height =scanner.nextDouble();
		System.out.println("몸무게를 입력하시오");
		double weight =scanner.nextDouble();
		/*
		코드완성
		2줄남음
		*/
		No07_kaup ss = new No07_kaup(height, weight);
		System.out.println(ss);
	}
}
