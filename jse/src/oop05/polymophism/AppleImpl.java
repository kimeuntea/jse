package oop05.polymophism;

public class AppleImpl implements FruitInterface {

	@Override
	public void display(String s) {
		// TODO Auto-generated method stub
		System.out.println(s + "사과입니다.");
	}

}
