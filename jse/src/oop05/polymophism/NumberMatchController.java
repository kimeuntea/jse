package oop05.polymophism;

import java.util.Scanner;

public class NumberMatchController {
	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("숫자 1 또는 0 를 입력하시오");
    int player = scanner.nextInt();
    int com =0;
    NumberMatchService matchService = new NumberMatchImpl();
    com =matchService.makeComVal();
    System.out.println("플레이어값 :" +player);
    System.out.println("컴퓨터값 : " +com);
    matchService.match(player , com);
    System.out.println(matchService.display());
	}
}
