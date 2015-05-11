package cmm02.op;

public class No03_2HangDemo {
	public static void main(String[] args) {
		int x = 20;
		int y = 7;

		int add = 0, gob = 0, mok = 0, neg = 0, sub = 0;
		add = x + y;
		sub = x - y;
		mok = x / y;
		neg = x % y;
		gob = x * y;
		System.out.println("+결과 :" + add);
		System.out.println("-결과 :" + sub);
		System.out.println("/결과 :" + mok);
		System.out.println("%결과 :" + neg);
		System.out.println("*결과 :" + gob);
	}
}
