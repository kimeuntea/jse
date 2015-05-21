package oop04.abstraction;

/*
 Date :
 Author : 
 Desc : 추상클래스 예시
 */public class AbsDemo {
	public static void main(String[] args) {
    Sum01 sum01 = new Sum01();
    System.out.println(sum01.sum(10, 20));
    System.out.println(sum01);
    
    Sum02  sum02 = new Sum02();
    System.out.println(sum02.sum(10, 20));
	System.out.println(sum02);
	
	
	
	}
}

abstract class AbsSum {
	public abstract String toString();

	public String sum(int i, int k) {
		int sum = i + k;
		return "" + sum;
		// int 리턴을 String 반환값 주는 방법
	}
}

class Sum01 extends AbsSum {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "class Sum01 extends AbsSum";
	}
}

class Sum02 extends AbsSum {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "class Sum02 extends AbsSum";
	}
}
