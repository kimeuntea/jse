package oop01.encapsle;

public class NumberMatchService {
	static int i;
	public int game(int com, int player) {
		int result;
		if (player == com) {
			System.out.println(player + "정답 !!");
			result = 1;

		} else {
			System.out.println("틀렷습니다.");
			System.out.println("컴퓨터가 선택한 값은 " + com + "입니다.");
			result = 0;
		}
		return result;
	}	
	public int logic(int a)
	{
	NumberMatchVo matchVo = new NumberMatchVo();
	int result = 0;
	for (i = 0; i < 3; i++) {
		System.out.println("1회부터 5회 까지 정수만 입력하시요");
		
		try {
			matchVo.setPlayer(a);
			matchVo.setCom();
		} catch (Exception e) {
			System.out.println("문자는 안됩니다.");
			return 0;
		}

		if (matchVo.getPlayer() == 0) {
			System.out.println("다시 입력해 주십시오");
			
		} else {
			matchVo.setCom();
			result = game(matchVo.getCom(), matchVo.getPlayer());
			if(result == 0)
			{
				return 0;
			}
		}

		if (result == 1) {
			System.out.println("맞혓습니다." + "게임을 종료합니다.");
			return 1;
	
		} else if (i == 2) {
			System.out.println("3회무도 참여했습니다."
					+ "\n 게임에 패했습니다."
					+ "\n 게임 종료합니다.");
			
		}
		
	}
	return result;
	}
	
}
