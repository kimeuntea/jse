package oop01.encapsle;

import java.util.Scanner;

public class PayController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
    PayService service = new PayService();
    System.out.println("이름을 입력하시오");
    String name = scanner.nextLine();
    System.out.println("급여를 입력하시오");
    int salary = scanner.nextInt();
   
    
    
    System.out.println("------급여내역------");
    System.out.println("성명:"+name);
    System.out.println("본봉:" +salary +"원");
    System.out.println("세금:" +  service.taxresult()+ "원");
    System.out.println("실수령액:" + service.logic(name, salary)+ "원");
	}

}
