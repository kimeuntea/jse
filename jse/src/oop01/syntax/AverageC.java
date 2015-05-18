package oop01.syntax;

public class AverageC {

	public static void main(String[] args) {
		AverageVo hulk = new AverageVo();
		AverageVo iron = new AverageVo();
		hulk.setName("헐크");
		hulk.setEng(80);
		hulk.setKor(70);
		System.out.println("==="+hulk.getName()+"의 성적표===");
		System.out.println("국어 :"+hulk.getKor()+"점");
		System.out.println("영어 :"+hulk.getEng()+"점");
		System.out.println("총점 :"+hulk.tot()+"점");
		System.out.println("평균 : "+hulk.avg()+"점");
		System.out.println();
		
		
		iron.setName("아이언");
		iron.setEng(85);
		iron.setKor(70);
		System.out.println("==="+iron.getName()+"의 성적표===");
		System.out.println("국어 :"+iron.getKor()+"점");
		System.out.println("영어 :"+iron.getEng()+"점");
		System.out.println("총점 :"+iron.tot()+"점");
		System.out.println("평균 : "+iron.avg()+"점");
		System.out.println();
	
	}

}
