package oop04.abstraction;

public class ProductController {
	public static void main(String[] args) {
      ComputerInfo ci = new ComputerInfo();
      ci.setComputerInfo("삼성", "센스", "a-1234-4567", "dual-core", "8G" ,"500MB");
      ci.displayProductInfo();
      System.out.println();
      TvInfo ti = new TvInfo();
     
      //메소드 호출
      //TV 정보는
      //g회사 : LG
      //제품명 : x캔버스
      //제품ID : x-1234
      
      ti.setTvInfo("LG", "x캔버스", "x-1234" , "42인티", "16:9");
      ti.displayProductInfo();
       
      
	}
}
