package oop05.polymophism;

public class FruitMain {
	public static void main(String[] args) {
    //���� ���̽��� ��ü�� ����� ����. 
    //�� , FuritInterface if = new FuritInterface(); �����߻�
	FruitInterface apple = new AppleImpl();
	FruitInterface banana; 
	//FruitInterface Ÿ���� ���������� ����
	banana = new BananaImpl();
	//Ŭ������ BananaImpl �� ��ü�� �����Ͽ� 
	//banana�� �Ҵ�
	FruitInterface orange = new OrangeImpl();
	
	apple.display("���մ�");
	banana.display("������");
	orange.display("���");
	
	//orange.getCount();
	//�������̽����� ����� �޼ҵ常 ȣ���� �����ϴ�. 
	}
}
