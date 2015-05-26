package oop09.nestedClass;

public class InnerClassAnonyHello {
	interface GreetingService {
   public void greet(String name);
	}
	public void sayHello(){
	/*
	����Ŭ����	
		
	*/
		 class EngilshGreetingServiceImpl implements GreetingService{

		@Override
		public void greet(String name) {
			// TODO Auto-generated method stub
			System.out.println("Hello " + name);
		}
		}	
		 GreetingService math = new GreetingService() {
			
			@Override
			public void greet(String name) {
				// TODO Auto-generated method stub
				System.out.println("������" + name);
			}
		};
		 GreetingService eng = new EngilshGreetingServiceImpl();
		 /*
		 ����Ŭ���� �������̽� ������� 2
		 */
		 GreetingService kor = new GreetingService(){
			
			@Override
			public void greet(String name) {
				// TODO Auto-generated method stub
				System.out.println("�ȳ��ϼ��� " + name);
			}
		};
		eng.greet("Tom");
		kor.greet("��");
		math.greet("����");
		
		
		 
	}
	public static void main(String[] args) {
		InnerClassAnonyHello greet = new InnerClassAnonyHello();
		greet.sayHello();
	}
		
	}
  

