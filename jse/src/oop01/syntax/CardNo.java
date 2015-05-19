package oop01.syntax;
/*
Date : 
Author :
Desc : static 예제

*/public class CardNo {
  private String kind;//카드의 무늬
  private int number;//카드의 숫자
  static int width =100;//카드의 폭
  static int height =250;//카드의 높이


public CardNo(String kind, int number) {
	super();
	this.kind = kind;
	this.number = number;
}



public String getCard() {
	return this.kind + this.number;
}



}
