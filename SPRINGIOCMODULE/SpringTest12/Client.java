import org.springframework.context.*;
import org.springframework.context.support.*;
class Client 
{
	public static void main(String[] args) 
	{
ApplicationContext ctx=new ClassPathXmlApplicationContext("spconfig.xml");
Object o=ctx.getBean("id1");
TestBean tb=(TestBean)o;
tb.show();

		System.out.println("Hello World!");
	}
}
