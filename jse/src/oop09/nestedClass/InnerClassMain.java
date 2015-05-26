package oop09.nestedClass;
public class InnerClassMain {
	/*
	 * 내부 클래스의 첫번째 형태 -인스턴스 내부 클래스 -멤버메소드를 클래스 내부에 선언함
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

	// CTRL + Shift + m 메소드 독립 단축기
	// 리팩토링
	public  void getInnerClassInstance() {
		InnerClassInstance.Inner inn = new InnerClassInstance().new Inner();
		inn.printData();
	}

}
