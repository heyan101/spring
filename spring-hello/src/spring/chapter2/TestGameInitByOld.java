package spring.chapter2;

import java.util.ArrayList;
import java.util.List;

public class TestGameInitByOld {

	public static void main(String[] args) {
		Medicine medicine = new Medicine();
		medicine.setBlood(10);
		medicine.setName("小药丸");
		
		Role role = new Role();
		role.setName("Mary");
		role.setHealth(100);
		List<Goods> goods = new ArrayList<Goods>();
		goods.add(medicine);
		role.setGoods(goods);
		
		System.out.println("Game person name: " + role.getName() + ", This the health is :" + 
				role.getHealth());
		if (role.getGoods() != null) {
			System.out.println(role.getName() + " 现有物品" + role.getGoods().size() + "件, 分"
					+ "别为: ");
			for (Goods good : role.getGoods()) {
				System.out.println(good.getName());
			}
		} else {
			System.out.println("暂时没有任何物品");
		}
	}

}
