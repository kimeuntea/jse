package oop05.polymophism;

public class OrangeImpl implements FruitInterface {

	@Override
	public void display(String s) {
		// TODO Auto-generated method stub
		System.out.println(s + "�������Դϴ�.");
	}

	public int getCount() {
		return 1000;
	}
}
