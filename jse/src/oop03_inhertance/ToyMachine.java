package oop03_inhertance;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class ToyMachine {
	private Vector<ToyVo> toys;
	private ToyVo toy;

	public ToyMachine() {
		this(10, 5);
	}

	public ToyMachine(int capa, int increment) {
		toys = new Vector<ToyVo>(capa, increment);
	}

	public void regis(String name, int price, ToySpec spec) {
		ToyVo toy = new ToyVo(name, price, spec);
		toys.addElement(toy);
	}

	public Vector<ToyVo> serachName(String name) {
		Vector<ToyVo> catchToys = new Vector<ToyVo>();
		for (int i = 0; i < toys.size(); i++) {
			while (toy instanceof ToyVo) {
				if (toy.getName().equalsIgnoreCase(name))
					;
				catchToys.add(toy);
			}
		}
		return catchToys;
	}

	public List<ToyVo> searchSpec(ToySpec searchSpec) {
		List<ToyVo> catchtoys = new ArrayList<ToyVo>();
		Enumeration<ToyVo> e = toys.elements();
		while (e.hasMoreElements()) {
			ToyVo toyVo = (ToyVo) e.nextElement();
			ToySpec toySpec = toy.getSpec();
			if (toySpec.equals(searchSpec)) {
				catchtoys.add(toy);
			}
		}
		return catchtoys;
	}

	public static void main(String[] args) {
		ToyMachine toyMachine = new ToyMachine();
		ToySpec spec = new ToySpec();
		spec.setProperty("사용자", ToyUser.ADULT);
		spec.setProperty("타입", ToyType.FIGURE);

		toyMachine.regis("스파이더맨", 50000, spec);
		List<ToyVo> list = toyMachine.getAll();
		for (ToyVo toy : list) {
			System.out.println(toy);
		}

	}

	private List<ToyVo> getAll() {
		
		return toys;
	}
}
