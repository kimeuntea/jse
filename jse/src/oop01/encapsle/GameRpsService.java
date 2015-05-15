package oop01.encapsle;

public class GameRpsService {
	GameRpsVo gameRpsVo = new GameRpsVo();

	public int Showcomvalue() {
		// TODO Auto-generated method stub
		return (int) ((Math.random() * 3) + 1);
	}

	public void logic(int action) {
		if (action == 1) {
			gameRpsVo.setRock(action);
		} else if (action == 2) {
			gameRpsVo.setPaper(action);
		} else {
			gameRpsVo.setScissors(action);
		}

	}

	String game3(int player, int com) {
    String result = "";
		switch (player) {
		case 1:result = "가위";break;
		case 2:result = "바위";break;
		case 3:result = "보"; break;
        
		}
		return null;
	}

	// ////////////////////////////////////////////////////
	String game2(int player, int com) {
		String result = "";

		// 가위 바위 보= 바위
		if (player == 1) {
			if (com == 2) {
				result = "com 바위 이겻습니다.";
			} else if (com == 3) {
				result = "player 가위  이겻습니다.";
			} else if (com == 1) {
				result = "비겻습니다.";
			}
		}
		// 바위 보 = 보
		else if (player == 2) {
			if (com == 1) {
				result = "player 바위 이겻습니다.";
			} else if (com == 2) {
				result = "비겻습니다.";
			} else if (com == 3) {
				result = "com 보 이겻습니다.";
			}
		}
		// 가위 보 = 가위
		else if (player == 3) {
			if (com == 1) {
				result = "com 가위 이겻습니다.";
			} else if (com == 2) {
				result = "player 바위가 이겻습니다. ";
			} else if (com == 3) {
				result = "비겻습니다.";
			}
		}
		return result;

	}
	
	String game(int player, int com) {
		String result = "";

		// 가위 바위 보= 바위
		if (player <com) {
			if (com == 2) {
				result = "com 바위 이겻습니다.";
			} else if (com == 3) {
				result = "player 가위  이겻습니다.";
			} else if (com == 1) {
				result = "비겻습니다.";
			}
		}
		// 바위 보 = 보
		else if (player == 2) {
			if (com == 1) {
				result = "player 바위 이겻습니다.";
			} else if (com == 2) {
				result = "비겻습니다.";
			} else if (com == 3) {
				result = "com 보 이겻습니다.";
			}
		}
		// 가위 보 = 가위
		else if (player == 3) {
			if (com == 1) {
				result = "com 가위 이겻습니다.";
			} else if (com == 2) {
				result = "player 바위가 이겻습니다. ";
			} else if (com == 3) {
				result = "비겻습니다.";
			}
		}
		return result;

	}

}
