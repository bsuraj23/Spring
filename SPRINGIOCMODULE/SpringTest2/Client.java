import org.springframework.core.io.*;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
class Client 
{
	public static void main(String[] args) 
	{
Resource res=new ClassPathResource("spconfig.xml");
BeanFactory factory=new XmlBeanFactory(res);
Resource res1=new ClassPathResource("spconfig1.xml");
BeanFactory factory1=new XmlBeanFactory(res1,factory);
		Object o=factory1.getBean("id3");
		
Journey j=(Journey)o;
j.startJourney();
		System.out.println("Hello World!");
	}
}
