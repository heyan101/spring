package spring.chapter2;

import java.util.List;

public interface GameRole {

	String getName();
	
	void setName(String name);
	
	int getHealth();
	
	void setHealth(int health);
	
	@SuppressWarnings("rawtypes")
	List getGoods();
	
	@SuppressWarnings("rawtypes")
	void setGoods(List goods);
	
	void useGoods(Goods goods);
}
