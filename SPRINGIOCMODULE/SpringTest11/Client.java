//import org.springframework.core.io.*;
//import org.springframework.beans.factory.*;
//import org.springframework.beans.factory.xml.*;
import org.springframework.context.*;
import org.springframework.context.support.*;
public class Client
{
	public static void main(String[] args)
	{
		//Resource res=new ClassPathResource("spconfig.xml");
		//BeanFactory factory=new XmlBeanFactory(res);
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spconfig.xml");
//ApplicationContext ctx=new FileSystemXmlApplicationContext("E:/durga/spconfig.xml");
		Object o=ctx.getBean("id1");
		Ex1 ex=(Ex1)o;
		ex.show();
	}
}
