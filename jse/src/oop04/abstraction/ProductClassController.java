package oop04.abstraction;

public class ProductClassController {
	public static void main(String[] args) {
		ComputerInfoClass ci = new ComputerInfoClass();
		ci.setInfo("»ï¼º", "¼¾½º", "a-1234", "dual-core", "8G" ,"500MB");
		
		TvInfoClass ti = new TvInfoClass();
		ti.setInfo("LG", "xÄµ¹ö½º", "x-1234" , "42ÀÎÄ¡", "16:9");
		
		
		ProductInerface pii[] 
				= new ProductInerface[2];
		
		pii[0] = ci;
		pii[1] = ti;
		
		for (int i = 0; i < pii.length; i++) {
			pii[i].displayInfo();
			System.out.println();
		}
	}
}
