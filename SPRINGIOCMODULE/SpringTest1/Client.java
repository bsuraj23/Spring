import org.springframework.core.io.*;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
class Client 
{
	public static void main(String[] args) 
	{
		
Resource res=new ClassPathResource("springconfig.xml");
BeanFactory factory=new XmlBeanFactory(res);
Object o=factory.getBean("id1");
WelcomeBean wb=(WelcomeBean)o;
System.out.println(wb);
		wb.show();
		System.out.println("Hello World!");
		Object o1=factory.getBean("id1");
WelcomeBean wb1=(WelcomeBean)o1;
System.out.println(wb1);

	}
}
