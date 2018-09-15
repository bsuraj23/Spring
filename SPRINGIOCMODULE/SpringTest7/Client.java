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
		A a1=(A)o;
		a1.show();
		Object o1=factory.getBean("id2");
		A a2=(A)o1;
		a2.show1();

		System.out.println("Hello World!");
	}
}
