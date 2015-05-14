package oop01.game;

import java.util.Scanner;

public class KaupService {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("키를 입력하시오");
		double height =scanner.nextDouble();
		System.out.println("몸무게를 입력하시오");
		double weight =scanner.nextDouble();
		
		KaupVo vo = new KaupVo();
		vo.setHeight(height);
		vo.setWeight(weight);
		vo.kaupmo();
		System.out.println(vo);
	}
	
}
