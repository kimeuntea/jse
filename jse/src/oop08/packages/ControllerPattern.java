package oop08.packages;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import oop02.encapsle.RpsController;

public class ControllerPattern {
	public static void main(String[] args) {
		ControllerPattern cp = new ControllerPattern();
		RpsController rps = new RpsController();
		Scanner scanner = new Scanner(System.in);
		int flag = 0;
		do {
			System.out.println("���� ���α׼��� ��ȣ�� �Է��ϼ���");
			System.out.println("�Է��� ��ġ���� 0�� �Է��ϼ���");
			flag =scanner.nextInt();
			
			switch (flag) {
			case 1: rps.main(args);
				
			
			}
		} while (flag != 0);
	}
	
	}

