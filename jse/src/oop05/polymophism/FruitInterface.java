package oop05.polymophism;
/*
객체 지향 다형성 구현의 핵심 원리


인터페이스를 구현하는 클래스들은 그 인터페이스
타입에 포함이 된다.
class  child extends Parent
상속관계에서 child 과 부모 타입에 포함되어
인터페이스를 구현한 클래스는 인터페이스
타입에 포함이 된다.



*/public interface FruitInterface {
 //인터페이스는 추상메소드 선언만 존재한다.
	//추상클래스는 일반메소드와
	//멤버변수 선언이 가능하다. 
	public void display(String s);
}
