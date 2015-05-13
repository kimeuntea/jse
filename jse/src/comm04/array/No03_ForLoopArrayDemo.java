package comm04.array;

import java.util.Scanner;

public class No03_ForLoopArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     No03_ForLoopArrayVo vo = new No03_ForLoopArrayVo();
     Scanner scanner = new Scanner(System.in);
     int a = scanner.nextInt();
     int b = scanner.nextInt();
     int c = scanner.nextInt();
     int d = scanner.nextInt();
     int e = scanner.nextInt();
     
    vo.setA(a);
    vo.setB(b);
    vo.setC(c);
    vo.setD(d);
    vo.setE(e);
    vo.vvv();
    No03_ForLoopArrayVo vo1 = new No03_ForLoopArrayVo();
    System.out.println(vo1.getA());
	}
}
