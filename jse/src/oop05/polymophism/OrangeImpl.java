package oop05.polymophism;

public class OrangeImpl implements FruitInterface {

	@Override
	public void display(String s) {
		// TODO Auto-generated method stub
		System.out.println(s + "오랜지입니다.");
	}

	public int getCount() {
		return 1000;
	}
}
