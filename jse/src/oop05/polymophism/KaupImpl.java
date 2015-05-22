package oop05.polymophism;

public class KaupImpl implements KaupInterface {
   
	KaupVO vo = new KaupVO();
	
	
	
   @Override
	public int getKaupIndex(double height,double weight) {
		// TODO Auto-generated method stub
	   vo.setHeight(height);
	    vo.setWeight(weight);
		return (int) (((vo.getWeight()/(vo.getHeight()*vo.getHeight()))*10000));
	}

	@Override
	public String getRsultMsg() {
	   String msg="";
	   int idx = getKaupIndex(vo.getHeight(),vo.getHeight());
				if(idx>30){msg = "��";}
				else if(idx>24){msg = "��ü��";}
				else if(idx>20){msg = "����";}
				else if(idx>15){msg = "��ü��";}
				else if(idx>13){msg = "����";}
				else if(idx>10){msg = "�������";}
				else{msg = "�Ҹ���";}
		
		return msg;
	}

	
}
