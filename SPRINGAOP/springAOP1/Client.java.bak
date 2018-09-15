import org.springframework.context.*;
import org.springframework.context.support.*;
public class Client 
{
	public static void main(String[] args) 
	{
System.out.println("==========================");
ApplicationContext ctx=new ClassPathXmlApplicationContext("spconfig.xml");
//ApplicationContext ctx=new FileSystemXmlApplicationContext("E:/durgatech/spconfig.xml");
		Object o=ctx.getBean("id1");
		TestInter tb=(TestInter)o;
		tb.m1();
System.out.println("=================");
tb.m2();
System.out.println("=================");
tb.m3();
	}
}
