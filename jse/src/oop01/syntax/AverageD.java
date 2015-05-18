package oop01.syntax;

public class AverageD {

	public static void main(String[] args) {
		AverageService hulk = new AverageService();
		String name="ÇæÅ©";
		int kor=80;
		int eng=70;
        hulk.name(name, kor, eng);
		System.out.println("==="+name+"ÀÇ ¼ºÀûÇ¥===");
		System.out.println("±¹¾î :"+kor+"Á¡");
		System.out.println("¿µ¾î :"+eng+"Á¡");
		System.out.println("ÃÑÁ¡ :"+hulk.tot()+"Á¡");
		System.out.println("Æò±Õ : "+hulk.avg()+"Á¡");
		System.out.println();
		
		
	}

}
