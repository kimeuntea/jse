package comm04.array;

public class No03_ForLoopArrayVo {

	private int total;
	/////////
	private int a;
 	private int b;
 	private int c;
 	private int d;
 	private int e;
	/*void vv(int a,int b,int c,int d,int e) {
		arr= new int[5];
	    arr[0]=a;
	    arr[1]=b;
	    arr[2]=c;
	    arr[3]=d;
	    arr[4]=e;
	      
	      1부터 5까지의 합을 구하시오 
	      
	      for (int i = 0; i < arr.length; i++) {
			this.total+=arr[i];
		}
	      System.out.println("\n 1부터 5까지의 합은 : "+total);
		}*/
	public void setA(int a) {
		this.a = a;
	}
	public void setB(int b) {
		this.b = b;
	}
	public void setC(int c) {
		this.c = c;
	}
	public void setD(int d) {
		this.d = d;
	}
	public void setE(int e) {
		this.e = e;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public int getC() {
		return c;
	}
	public int getD() {
		return d;
	}
	public int getE() {
		return e;
	}
	void vvv() {
		int[] arr = {getA(),getB(),getC(),getD(),getE()}; 
	      /*
	      1부터 5까지의 합을 구하시오 
	      */
	      for (int i = 0; i < arr.length; i++) {
			this.total+=arr[i];
		}
	      System.out.println("\n 1부터 5까지의 합은 : "+total);
		}
	}
