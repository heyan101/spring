package spring.chapter2.setDemo;

import spring.chapter2.Box;

public class NullBox implements Box {

	@Override
	public Object smash() {
		return null;
	}

}
