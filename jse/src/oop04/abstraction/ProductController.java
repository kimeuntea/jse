package oop04.abstraction;

public class ProductController {
	public static void main(String[] args) {
      ComputerInfo ci = new ComputerInfo();
      ci.setComputerInfo("�Ｚ", "����", "a-1234-4567", "dual-core", "8G" ,"500MB");
      ci.displayProductInfo();
      System.out.println();
      TvInfo ti = new TvInfo();
     
      //�޼ҵ� ȣ��
      //TV ������
      //gȸ�� : LG
      //��ǰ�� : xĵ����
      //��ǰID : x-1234
      
      ti.setTvInfo("LG", "xĵ����", "x-1234" , "42��Ƽ", "16:9");
      ti.displayProductInfo();
       
      
	}
}
