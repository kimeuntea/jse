package oop04.abstraction;

public class TvInfo extends ProductInfo{

	protected String inchInfo;
	protected String screenRatioInfo;
	
	@Override
	public void displayProductInfo() {
		System.out.println("제조회사 : " + this.productCompany);
		System.out.println("제품명 : " + this.productName);
		System.out.println("고유번호 : " + this.productSeriaID);
		System.out.println("인치정보 : " + this.inchInfo);
		System.out.println("화면비율 : " + this.screenRatioInfo);
	}
   // 아래 정보는 완성하시오 
	public void setTvInfo(String productCompany,
			String productName,
			String productSeriaID,
			String inchInfo,
			String screenRatioInfo){
		
		super.setProductInfo(productCompany, productName, productSeriaID);
	    this.inchInfo =inchInfo;
	    this.screenRatioInfo = screenRatioInfo;
		
		//메소드 호출
	      //TV 정보는
	      //g회사 : LG
	      //제품명 : x캔버스
	      //제품ID : x-1234
		
	}
}
