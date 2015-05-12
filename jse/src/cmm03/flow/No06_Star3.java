package cmm03.flow;

public class No06_Star3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 0;
		// ¡Ú
		char star = '¡Ú';
		String aa = "a";
		for (int i = 5; i > 0; i--) {
			System.out.println();
			
			for (int j = 0; j < i; j++) {
				if(j>(5-i)){System.out.print(aa);}
				System.out.print(star);

			} 
		}
	}

}
