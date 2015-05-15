package oop01.encapsle;

public class KaupVo {
	private double height;
	double weight;
	int idx;
	String msg;

	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getMsg() {
		return msg;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	void kaupmo()
	{
	
		setIdx( (int) ((this.weight/(this.height*this.height))*10000));
		setMsg();
	}
	 public void setMsg(){
			
			if(idx>30){msg = "비만";}
			else if(idx>24){msg = "과체중";}
			else if(idx>20){msg = "정상";}
			else if(idx>15){msg = "저체중";}
			else if(idx>13){msg = "마름";}
			else if(idx>10){msg = "영양실조";}
			else{msg = "소모증";}
		
		
		}
	 public String toString() {
			return "카우프지수 No07_kaup [키=" + height +"cm "+ ", 몸무게=" + weight +"kg"+", 카우프지수="
					+ getMsg() + "]";
		}
}
