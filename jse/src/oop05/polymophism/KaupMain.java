package oop05.polymophism;

import java.util.Scanner;

public class KaupMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ű�� �Է��Ͻÿ�");
		double height = scanner.nextDouble();
		System.out.println("�����Ը� �Է��Ͻÿ�");
		double weight = scanner.nextDouble();
        
		KaupImpl impl = new KaupImpl();
			
		KaupInterface is;
		is = impl;
		is.getKaupIndex(height, weight);
		
		System.out.println("ī����������  : "+is.getRsultMsg()+ "�Դϴ�.");
		
		
		
	}
}
