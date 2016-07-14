package spring.chapter2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class GameInitBySpring {

	public static void main(String[] args) {
		Resource res = new ClassPathResource("spring/chapter2/bean.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		Role role = (Role) factory.getBean("role");
		
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
