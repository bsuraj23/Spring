import org.springframework.core.io.*;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
public class Client 
{
	public static void main(String[] args) 
	{
		Resource res=new ClassPathResource("spconfig1.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		Object o=factory.getBean("id1");
		DemoBean db=(DemoBean)o;
		db.show();
		System.out.println("Hello World!");
	}
}
