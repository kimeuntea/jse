package oop05.polymophism;

import java.util.Scanner;

public class RpsMain {
	public static void main(String[] args) {
		RpsServiceImpl rpsimpl = new RpsServiceImpl();
		RpsService rpsService;
		rpsService = rpsimpl;
		
		System.out.println("���� ���� �� ������ �����մϴ�.");
		System.out.println("1.���� 2.����  3.���ڱ� �� �Է��Ͻÿ�");
		Scanner scanner  = new Scanner(System.in);
		int player = scanner.nextInt();
		rpsService.showRpsVal(player);
		
		
		System.out.println("�÷��̾�� "+rpsService.showRpsVal(player)+"�� �����ϴ�.");
		int comVal = rpsService.displayComVal();
		rpsService.showRpsVal(comVal);
		System.out.println("��ǻ�ʹ�"+rpsService.showRpsVal(comVal) +"�� �����ϴ�.");
		String winner = rpsService.showWinner(player,comVal);
		System.out.println(winner);
		
	}
}
