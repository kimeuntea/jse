package oop05.polymophism;

public interface NumberMatchService {
	/*
	��ǻ�Ͱ� �������� �����ϴ� ����
	0 �� 1�� �߻� ��Ŵ
	*/public int makeComVal();
	/*
	�ΰ��� �Ķ���͸� ���ؼ� ��ġ�ϸ� true
	�ٸ��� false ����
	*/
	public  boolean match(int player,int comVal);
	/*
makComval()�� ���ϰ��� true �� �÷��̾� �¸�
�ٸ��� ��ǻ�ͽ¸���� �޼��� ���
	
*/	

	public String display();
	
}
