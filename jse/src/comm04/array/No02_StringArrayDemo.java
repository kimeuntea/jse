package comm04.array;

import java.util.Arrays;

public class No02_StringArrayDemo {
   
	public static void main(String[] args) {
		No02_StringArrayVo juso = new No02_StringArrayVo();
		juso.String_array("서울", "종로", "광화문");
       
		

	}

}
class No02_StringArrayVo
{
	String[] juso;
	public No02_StringArrayVo() {}
	/*public No02_StringArrayVo(String a,String b,String c) {
		// TODO Auto-generated constructor stub
		juso = new String[3];
		juso[0] =a;
		juso[1] =b;
		juso[2] =c;
	}*/
	
	public void String_array(String a,String b,String c)
	{
		juso = new String[3];
		juso[0] =a;
		juso[1] =b;
		juso[2] =c;
		for (String string : juso) {
			System.out.println(string);
		}
	}
	@Override
	public String toString() {
		return Arrays.toString(juso);
	}
	
}
