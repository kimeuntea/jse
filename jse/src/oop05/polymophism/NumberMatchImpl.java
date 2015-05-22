package oop05.polymophism;

public class NumberMatchImpl implements NumberMatchService {
NumberMatchVo vo = new NumberMatchVo();
	@Override
	public int makeComVal() {
		
		vo.setCom((int)((Math.random()*1)));
		return vo.getCom();
	}

	@Override
	public boolean match(int player, int comVal) {
		boolean result;
		vo.setPlayer(player);
		vo.setCom(comVal);
			
			if (vo.getPlayer() == vo.getCom()) {
				result= true;
				
			}else{
				result= false;
			}
			
		return result;
	}

	                         

	@Override
	public String display() {
		boolean result= match(vo.getPlayer(), vo.getCom());
		String msg ="";
		if(result == true){
			msg = "¸ÂÇú½À´Ï´Ù.";
		}else{
			msg = "Æ²·Ç½À´Ï´Ù..";
		}
		return msg;
	}

}
