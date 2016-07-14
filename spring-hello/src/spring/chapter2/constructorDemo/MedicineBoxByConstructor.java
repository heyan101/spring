package spring.chapter2.constructorDemo;

import java.util.List;
import java.util.Random;

import spring.chapter2.Box;
import spring.chapter2.Goods;

public class MedicineBoxByConstructor implements Box {

	private List<Goods> goods;
	
	public List<Goods> getGoods() {
		return this.goods;
	}
	
	public MedicineBoxByConstructor(List<Goods> goods) {
		this.goods = goods;
	}

	@Override
	public Goods smash() {
		Random random = new Random();
		int i = random.nextInt(this.goods.size());
		return this.goods.get(i);
	}

}
