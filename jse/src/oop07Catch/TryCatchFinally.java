package oop07Catch;

/*
 ..finally ..
 ���� �߻� ���ο� �������
 �ݵ�� ����Ǵ� ����

 */public class TryCatchFinally {
	public static void main(String[] args) {
		try {
			System.out.println("�޼ҵ� ���� �� ...");
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("finally ������..");
		}
	}
}
