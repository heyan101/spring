package spring.chapter1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class Hello {

	private String msg;
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public void sayHello() {
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		Resource res = new ClassPathResource("spring/chapterl/bean.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		// 通过资源文件，获取 Hello对象
		Hello hello = (Hello) factory.getBean("hellobean");
		hello.sayHello();
	}
}
