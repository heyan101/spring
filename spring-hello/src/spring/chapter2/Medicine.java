package spring.chapter2;

public class Medicine implements Goods{

	private String name;
	private int bloods;
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int getBlood() {
		return this.bloods;
	}

	@Override
	public void setBlood(int blood) {
		this.bloods = blood;
	}

}
