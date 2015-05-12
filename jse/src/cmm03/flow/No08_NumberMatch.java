package cmm03.flow;

import java.util.Scanner;

public class No08_NumberMatch {
	public static void main(String[] args) {
		No08_NumberMatchVo matchVo = new No08_NumberMatchVo();
		Scanner scanner = new Scanner(System.in);
		int result = 0;
		/*
		 * do { System.out.println("숫자를 입력하시오");
		 * matchVo.setPlayer(scanner.nextInt()); matchVo.setCom(); result =
		 * matchVo.game(matchVo.getCom(), matchVo.getPlayer()); } while (result
		 * != 1);
		 */
		
		for (int i = 0; i < 3; i++) {
			System.out.println("1회부터 5회 까지 정수만 입력하시요");
			
			try {
				int input = scanner.nextInt();
				matchVo.setPlayer(input);
				matchVo.setCom();
			} catch (Exception e) {
				System.out.println("문자는 안됩니다.");
			}

			if (matchVo.getPlayer() == 0) {
				System.out.println("다시 입력해 주십시오");
			} else {
				matchVo.setCom();
				result = matchVo.game(matchVo.getCom(), matchVo.getPlayer());
			}

			if (result == 1) {
				System.out.println("맞혓습니다." + "게임을 종료합니다.");
				break;
			} else if (i == 2) {
				System.out.println("3회무도 참여했습니다."
						+ "\n 게임에 패했습니다."
						+ "\n 게임 종료합니다.");
				
			}
		}
		
	}
}
