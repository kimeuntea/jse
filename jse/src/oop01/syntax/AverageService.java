package oop01.syntax;

public class AverageService {
//VO에 있던 avg(),tot()메소드를 
	//서비스에서 처리하도록
AverageDVO vo = new AverageDVO();
	public void name(String name, int kor, int eng)
	{
		vo.setName(name);
		vo.setKor(kor);
		vo.setEng(eng);
	}

   public int tot()
	{
		return vo.getEng()+vo.getKor();
	}
	public double avg()
	{
		return (vo.getKor()+vo.getEng())/2d;
	}	
	
}
