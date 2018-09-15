import org.springframework.context.*;
import org.springframework.context.support.*;
public class Client
{
	public static void main(String []args)
	{
		try{
		System.out.println("from client application beginning");
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spconfig.xml");
		Object obj=ctx.getBean("id4");
		TestInter ti=(TestInter)obj;
		try{
		ti.doCalc(10,2);
		}catch(Exception e){}
		System.out.println("===============");
        ti.doCalc(10,0);
		}
		finally{
	System.out.println("from client application ending");
		}
	}
}