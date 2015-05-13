package comm04.array;

public class No04_MultiDimArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] name = {
				{"Mr","Mrs","Ms"},
				{"Saith","John"}
		};
		System.out.println(name[0][1]+"."+name[1][0]) ;
		System.out.println(name[0][2]+"."+name[1][1]);
		/*
	Mr.Saith
	Ms.John	
	*/
	}
}
