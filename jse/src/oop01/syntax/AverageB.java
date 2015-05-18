package oop01.syntax;

public class AverageB {
	String name;
	int kor;
	int eng;
	//메소드 정의하세오
	//메소드의 객체화를 해주세요
	public int tot()
	{
		return this.kor+this.eng;
	}
	public double avg()
	{
		return (this.kor+this.eng)/2d;
	}
	
	public static void main(String[] args) {
		AverageB hulk = new AverageB();
		AverageB iron = new AverageB();
		
		
		hulk.name="헐크";
		hulk.kor=90;
		hulk.eng=85;
		
		System.out.println("==="+hulk.name+"의 성적표===");
		System.out.println("국어 :"+hulk.kor+"점");
		System.out.println("영어 :"+hulk.eng+"점");
		System.out.println("총점 :"+hulk.tot()+"점");
		System.out.println("평균 : "+hulk.avg()+"점");
		System.out.println();
		//아이언
		iron.name="아이언";
		iron.kor=70;
		iron.eng=85;
		System.out.println("==="+iron.name+"의 성적표===");
		System.out.println("국어 :"+iron.kor+"점");
		System.out.println("영어 :"+iron.eng+"점");
		System.out.println("총점 :"+iron.tot()+"점");
		System.out.println("평균 : "+iron.avg()+"점");
		System.out.println();
		//토르
	
	}
}
