package oop05.polymophism;

public class FruitMain {
	public static void main(String[] args) {
    //인터 페이스는 객체를 만들수 없다. 
    //즉 , FuritInterface if = new FuritInterface(); 에러발생
	FruitInterface apple = new AppleImpl();
	FruitInterface banana; 
	//FruitInterface 타입의 참조변수를 선언
	banana = new BananaImpl();
	//클래스는 BananaImpl 의 객체를 생성하여 
	//banana를 할당
	FruitInterface orange = new OrangeImpl();
	
	apple.display("맛잇는");
	banana.display("오래된");
	orange.display("비싼");
	
	//orange.getCount();
	//인터페이스에서 선언된 메소드만 호출이 가능하다. 
	}
}
