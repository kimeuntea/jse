package oop01.syntax;

public class AverageEVO {
	private String name;
	private int kor;
	private int eng;
	public AverageEVO() {}
	public AverageEVO(String name, int kor, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	 public int tot()
		{
			return this.kor+this.eng;
		}
		public double avg()
		{
			return (this.kor+this.eng)/2d;
		}	
		
		
}
	//getter setter 를 사용하지 마시고 
	//생성자로 처리
	//단 avg tot를 은 작성
