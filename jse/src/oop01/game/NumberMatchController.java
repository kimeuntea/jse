package oop01.game;

import java.util.Scanner;

public class NumberMatchController {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int result=0;
		NumberMatchService matchService = new NumberMatchService();
		int a=0;
	
			 a=scanner.nextInt();
			result=matchService.logic(a);
			
		}
				
	
	}
