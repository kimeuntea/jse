package oop05.polymophism;

public class RpsServiceImpl implements RpsService {
RpsVO  vo = new RpsVO();
	@Override
	public int displayComVal() {
		
		return  (int) ((Math.random() * 3) + 1);
	}

	@Override
	public String showWinner(int player, int com) {
		if (player == 1) {
			vo.setRock(player);
		} else if (player == 2) {
			vo.setPaper(player);
		} else if (player == 3) {
			vo.setScissors(player);
		}
		String msg = "";
		
		
		switch (player - com) {
		case 0:
			msg = "�����ϴ�.";
			break;
		case 1:
		case -2:
			msg = "�¸��ڴ� ����Դϴ�.";
			break;
		default: 
			msg = "�¸��ڴ� ��ǻ���Դϴ�.";
			break;
		}
		
		return msg;
	}

	@Override
	public String showRpsVal(int val) {
		String result = "";
		switch (val) {
		case 1:
			result = "����";
			break;
		case 2:
			result = "����";
			break;
		case 3:
			result = "��";
			break;

		}
		return result;
	}

}
