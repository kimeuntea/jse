package comm04.array;
public class No05_MultiDimArrayDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score = { 
				{ 90, 90,90}, 
				{ 20, 20, 20 }, 
				{ 30, 30, 30 },
				{ 40, 40, 40 }, 
				{ 50, 50, 50 }
		};
		int korTal = 0;
		int engTal = 0;
		int mathTal = 0;

		System.out.println("번호 국어 영어 수학 총점 평균");
		System.out.println("===================");

		for (int i = 0; i < score.length; i++) {
			int sum = 0;
			korTal += score[i][0];
			engTal += score[i][1];
			mathTal += score[i][2];
			System.out.print("\n "+(i+1)+" ");
		
			for (int j = 0; j < score[i].length; j++) {
				sum+=score[i][j];
				System.out.print(score[i][j]+" ");
				}
			System.out.print(sum+" "+sum/(float)score[i].length);
		}
		System.out.println("\n============================");
		//아래 총점에서 국어, 영어,수하그 총점이 나오게 하시오 
		System.out.println("총점 :");
		korTal=0;
		engTal=0;
		mathTal=0;
		for (int i = 0; i < score.length; i++) {
			korTal += score[i][0];
			engTal += score[i][1];
			mathTal += score[i][2];
		}
		System.out.print(korTal+" ");
		System.out.print(engTal+" ");
		System.out.print(mathTal+" ");
	}
}
