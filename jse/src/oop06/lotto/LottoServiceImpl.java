package oop06.lotto;

public class LottoServiceImpl implements LottoService {
	private int money;
	int[][] lottos;
	int[][] arr;

	@Override
	public void extractLottos(int money) {
		inputMoney(money);//돈넣기
		int count = this.getCount(money);//거스름돈
		int i=0;
		for(count =0;count <lottos.length;count++){
			while(true){
			//내부는 구형해주세요
				// isDuplication()메소드를 사용해야합니다.
				//중족되는 않은 숫자이면 
				//lottos[count][i]=num의
				//형태로 들어가게됩니다. 
				/*for (  i= 0;  < lottos.length; i++) {
					lottos[i][j];
				} */
			}
		}
	}

	public void printLotto() {
		

	}

	@Override
	public void inputMoney(int money) {
		this.money = money;
		lottos = new int[money / 1000][6];
	}

	@Override
	public int getRandomNumber() {

		return (int) ((Math.random() * 45) + 1);
	}

	@Override
	public boolean isDuplication() {
		
		return false;
	}

	@Override
	public void sort(int[] array) {
		
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					// getRandomNumber()
				}
			}
		}
	}

	@Override
	public int getCount(int money) {
		if(money < 1000){
			return 0;
		}
		return (int) Math.ceil(money/1000);
	}

}
