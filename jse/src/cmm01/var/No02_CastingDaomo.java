package cmm01.var;

/*
 * Upcasting
 * =변환(Conversion)
 * =promotion
 * =묵시적(implict) 자동변환
 * :자바가 제공하는  자동변환으로 묵시적인 동작
 * 데이터 타입의 표현범위가 작은쪽에서 많은쪽으로 변환 될때만
 * 가능하다
 */
public class No02_CastingDaomo {
	public static void main(String[] args) {
		byte varByte = 1;
		int varInt = 123;
		double varDou = 123.456d;

		int upByte = varByte;
		double upInt = varByte;

		/*
		 * Down-Casting = 캐스팅(Casting) 강제 형변환 :프로그램에서 명식적으로 지정하는 타입 변환 축소변환이 되는
		 * 경우는 반드시 명시적으로 캐스팅하여야 한다. 주위 !! 데이터 손실이 발생할수있다.
		 */

		float varflo = 123.456f;
		int downflo = (int) varflo;
		System.out.println("다운캐스팅 결과값  : " + downflo);

	}
}
