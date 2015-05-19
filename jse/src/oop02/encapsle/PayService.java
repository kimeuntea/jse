package oop02.encapsle;

import cmm03.flow.star;

public class PayService {
	PayVo vo = new PayVo();
	public int logic(String name, int salary) {
		
		vo.setName(name);
		vo.setSalary(salary);

		vo.setIncome((int) (vo.getSalary() - (vo.getTax() * vo.getSalary())));
	
		return vo.getIncome();
		
	}

	public int taxresult() {

		return (int) (vo.getTax()*vo.getSalary());
	}
}
