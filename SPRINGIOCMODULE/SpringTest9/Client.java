import org.springframework.core.io.*;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
class Client 
{
	public static void main(String[] args) 
	{
		Resource res=new ClassPathResource("spconfig.xml");
		BeanFactory factory=new XmlBeanFactory(res);
Object o=factory.getBean("id1");
DemoBean db=(DemoBean)o;
db.printMap();
Object o1=factory.getBean("id2");
DemoBean db1=(DemoBean)o1;
db1.printList();

	}
}