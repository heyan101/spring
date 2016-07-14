package spring.chapter2;

import java.util.List;

public class Role implements GameRole{
	
	private String name;

	private int health;
	
	private List<Goods> goods;

	@Override
	public List<Goods> getGoods() {
		return this.goods;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int getHealth() {
		return health;
	}

	@Override
	public void setHealth(int health) {
		this.health = health;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void setGoods(List goods) {
		this.goods = goods;
	}

	@Override
	public void useGoods(Goods goods) {
		this.goods.remove(goods);
	}


}
