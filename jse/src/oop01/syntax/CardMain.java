package oop01.syntax;

public class CardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		System.out.println("카드 높이 : "+CardNo.height);
        System.out.println("카드 너비 : "+CardNo.width);
      
      //참조변수 생성하셔서 아래 결과처럼
     //출력
      
      CardNo player = new CardNo("하트",3);
      CardNo com = new CardNo("스페이스",5);
    
      
      System.out.println("플레이어는"+player.getCard()+"이고 ");//heart space
      System.out.println("컴퓨터가" +com.getCard() +"라서 컴퓨터가 이겻습니다.");
	}

}
