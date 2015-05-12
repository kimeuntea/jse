package cmm03.flow;

import java.util.Scanner;

public class No2_IfElseDemo {

	int big;
	
	public void getBig(int a,int b,int c){
		if(a>b && a>c){
			System.out.println("가장 큰 수는 A 값만 "+a+"입니다. ");
		}else if(b>a && b>c){
			System.out.println("가장 큰 수는 A 값만 "+b+"입니다. ");
		}else{
			System.out.println("가장 큰 수는 A 값만 "+c+"입니다. ");
		}
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		No2_IfElseDemo instace = new No2_IfElseDemo();
		Scanner scan = new Scanner(System.in);
		System.out.println("A값을 입력하시오 ");
		int a = scan.nextInt();
		System.out.println("B값을 입력하시오 ");
		int b = scan.nextInt();
		System.out.println("c값을 입력하시오 ");
		int c = scan.nextInt();
		instace.getBig(a, b, c);
		
		
	}

}
