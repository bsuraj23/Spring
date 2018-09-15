import org.springframework.core.io.*;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
public class Client
{
	public static void main(String[] args)
	{
Resource res=new FileSystemResource("D:/advancedjava4pm/spconfig.xml");
BeanFactory bf=new XmlBeanFactory(res);
Object o=bf.getBean("id1");
SampleBean sb=(SampleBean)o;
sb.printMap();
System.out.println("=====================");
sb.printList();
	}
}
