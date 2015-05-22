package oop05.polymophism;

import java.util.Scanner;

public class KaupMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("키를 입력하시오");
		double height = scanner.nextDouble();
		System.out.println("몸무게를 입력하시오");
		double weight = scanner.nextDouble();
        
		KaupImpl impl = new KaupImpl();
			
		KaupInterface is;
		is = impl;
		is.getKaupIndex(height, weight);
		
		System.out.println("카우프지수는  : "+is.getRsultMsg()+ "입니다.");
		
		
		
	}
}
