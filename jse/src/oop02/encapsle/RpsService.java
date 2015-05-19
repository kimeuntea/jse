package oop02.encapsle;

public class RpsService {
	RpsUtil rpsUtil = new RpsUtil();
	RpsVO vo = new RpsVO();

	public int displayComVal() {
		return (int) ((Math.random() * 3) + 1);
	}

	/*
	 * 승자를 보여주는 로직
	 */public String showWinner(int player, int com) {
		// TODO Auto-generated method stub
		if (player == 1) {
			vo.setRock(player);
		} else if (player == 2) {
			vo.setPaper(player);
		} else if (player == 3) {
			vo.setScissors(player);
		}
		String result = "";
		
		/*
		switch (player = com) {
		case 0:
			result = "비겻습니다.";
			break;
		case 1:case 2:
			result = "플레이어가 이겻습니다.";
			break;

		default:
			result = "플레이어가 졋습니다.";
			break;
		}
		*/
		
		if (player < com) {
			if (Math.abs(player - com) == 2) {
				result = "컴퓨터가 이겻습니다.";
			} else {
				result = "플레이어가 이겻습니다.";
			}
		} else if (player > com) {
			if (Math.abs(player - com) == 2) {
				result = "컴퓨터가 이겻습니다.";
			} else {
				result = "플레이어가 이겻습니다.";
			}

		} else {
			result = "비겻습니다.";
		}

		return result;
	}

	// 숫자에 할당된 가위바위보 를 문자로 전환해서 보여주는 역할
	public String showRpsVal(int val) {

		String result = "";
		switch (val) {
		case 1:
			result = "가위";
			break;
		case 2:
			result = "바위";
			break;
		case 3:
			result = "보";
			break;

		}
		return result;
	}
}
