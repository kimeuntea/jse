package oop09.nestedClass;
public class InnerClassMain {
	/*
	 * ���� Ŭ������ ù��° ���� -�ν��Ͻ� ���� Ŭ���� -����޼ҵ带 Ŭ���� ���ο� ������
	 */public static void main(String[] args) {
		InnerClassMain m = new InnerClassMain();
		//m.getInnerClassInstance();
		//m.getInnerClassLocal();
		//m.getInnerClassStatic();
		m.getInnerClassAnonyServiceImpl();
		
	}

	private  void getInnerClassAnonyServiceImpl() {
		InnerClassAnonyServiceImpl inn = new InnerClassAnonyServiceImpl();  
		inn.print();
	}

	private  void getInnerClassStatic() {
		InnerClassStatic.Inner inn =new InnerClassStatic.Inner();
		inn.printData();
	}

	public  void getInnerClassLocal() {
		InnerClassLocal outer = new InnerClassLocal();
		outer.innerTest(1000);
	}

	// CTRL + Shift + m �޼ҵ� ���� �����
	// �����丵
	public  void getInnerClassInstance() {
		InnerClassInstance.Inner inn = new InnerClassInstance().new Inner();
		inn.printData();
	}

}
