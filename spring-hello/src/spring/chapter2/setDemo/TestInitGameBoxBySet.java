package spring.chapter2.setDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import spring.chapter2.Box;

@SuppressWarnings("deprecation")
public class TestInitGameBoxBySet {

	public static void main(String[] agrs) {
		Resource res = new ClassPathResource("spring/chapter2/setDemo/setBean.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		MedicineBox mBox = (MedicineBox) factory.getBean("medicineBox");
		PoisonBox pBox = (PoisonBox) factory.getBean("poisonBox");
		NullBox nBox = (NullBox) factory.getBean("nullBox");
		
		Random random = new Random();
		int num = 10;
		List<Box> boxes = new ArrayList<Box>();
		System.out.println("num = " + num);
		for (int i = 0; i < num ; ++i) {
			if (random.nextInt(20) == 1) {
				boxes.add(mBox);
			}else if (random.nextInt(20) == 4) {
				boxes.add(pBox);
			} else {
				boxes.add(nBox);
			}
		}
		System.out.println("系统随机出 " + boxes.size() + " 个方块，分别是：");
		for (Box box : boxes) {
			if (box instanceof MedicineBox) {
				MedicineBox medicineBox = (MedicineBox) box;
				System.out.println("这个方块打碎后爆出：" + medicineBox.smash().getName() + 
						", 该物品增加生命值：" + medicineBox.smash().getBlood());
			} else if (box instanceof PoisonBox) {
				PoisonBox poisonBox = (PoisonBox) box;
				System.out.println("这个方块打碎后爆出：" + poisonBox.smash().getName() + 
						", 该物品增加生命值：" + poisonBox.smash().getBlood());
			} else  if (box instanceof NullBox) {
				System.out.println("这是一个空方块！");
			}
		}
	}
}
