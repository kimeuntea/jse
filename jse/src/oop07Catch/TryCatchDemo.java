package oop07Catch;

/*
 ���ܴ� ���α׷� ���߽� �߻��ϴ� ������ �ٸ� ����
 ���α׷� ���߽� �߻��ϴ� ������ ���� ��ó�� �ʼ�
 ���������� �������� ��߿� �߻��ϴ� ������ ��κ��� ����;;.
 ���ܴ� �ڵ�� �߻��� ������ �ٸ���
 �����Ͻ� ������ �߻����� ����

 try{
 IO DBMS , NetWork ���� �ڵ尡 �ַ� ��ġ}
 catch(exception){
 ������ ����Ǵ� �ڵ��
 }
 */public class TryCatchDemo {
	public static void main(String[] args) {
		int a = 5, b = 0;
		int mok = 0, nmg = 0;
		try {
			mok = a/b;
			nmg = a%b;
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("�����߻�");
		}
		System.out.println(a+"/"+b+"="+mok);
		System.out.println(a+"%"+b+"="+nmg);
	}
}
