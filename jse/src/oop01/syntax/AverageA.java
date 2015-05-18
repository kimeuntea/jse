package oop01.syntax;

public class AverageA {
	String name;
	int kor,eng;
	public static void main(String[] args) {
    //tot avg 지역변수를 선언하시고
		//아래와 같이 출력되도록 해주세요
		int tot=0;
		double avg=0;
		AverageA hulk = new AverageA();
		AverageA iron = new AverageA();
		AverageA thor = new AverageA();
		hulk.name="헐크";
		hulk.kor=90;
		hulk.eng=80;
		tot = hulk.kor+hulk.eng;
		avg = tot/2d;
		System.out.println("==="+hulk.name+"의 성적표===");
		System.out.println("국어 :"+hulk.kor+"점");
		System.out.println("영어 :"+hulk.eng+"점");
		System.out.println("총점 :"+tot+"점");
		System.out.println("평균 : "+avg+"점");
		System.out.println();
		//아이언
		iron.name="아이언";
		iron.kor=70;
		iron.eng=80;
		tot = iron.kor+iron.eng;
		avg = tot/2d;
		System.out.println("==="+iron.name+"의 성적표===");
		System.out.println("국어 :"+iron.kor+"점");
		System.out.println("영어 :"+iron.eng+"점");
		System.out.println("총점 :"+tot+"점");
		System.out.println("평균 : "+avg+"점");
		System.out.println();
		//토르
		thor.name="토르";
		thor.kor=60;
		thor.eng=85;
		tot = thor.kor+thor.eng;
		avg = tot/2d;
		System.out.println("==="+thor.name+"의 성적표===");
		System.out.println("국어 :"+thor.kor+"점");
		System.out.println("영어 :"+thor.eng+"점");
		System.out.println("총점 :"+tot+"점");
		System.out.println("평균 : "+avg+"점");
		System.out.println();
	}
}
