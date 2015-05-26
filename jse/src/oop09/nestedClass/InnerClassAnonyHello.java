package oop09.nestedClass;

public class InnerClassAnonyHello {
	interface GreetingService {
   public void greet(String name);
	}
	public void sayHello(){
	/*
	내부클래스	
		
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
				System.out.println("곤니찌와" + name);
			}
		};
		 GreetingService eng = new EngilshGreetingServiceImpl();
		 /*
		 내부클래스 인터페이스 구현방법 2
		 */
		 GreetingService kor = new GreetingService(){
			
			@Override
			public void greet(String name) {
				// TODO Auto-generated method stub
				System.out.println("안녕하세요 " + name);
			}
		};
		eng.greet("Tom");
		kor.greet("톰");
		math.greet("수학");
		
		
		 
	}
	public static void main(String[] args) {
		InnerClassAnonyHello greet = new InnerClassAnonyHello();
		greet.sayHello();
	}
		
	}
  

