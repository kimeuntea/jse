package oop05.polymophism;

import java.util.Scanner;

public class NumberMatchController {
	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("���� 1 �Ǵ� 0 �� �Է��Ͻÿ�");
    int player = scanner.nextInt();
    int com =0;
    NumberMatchService matchService = new NumberMatchImpl();
    com =matchService.makeComVal();
    System.out.println("�÷��̾ :" +player);
    System.out.println("��ǻ�Ͱ� : " +com);
    matchService.match(player , com);
    System.out.println(matchService.display());
	}
}
