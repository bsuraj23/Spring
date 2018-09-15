import org.springframework.context.*;
import org.springframework.context.support.*;
class AfterThrowingAdviceTest  
{
	public static void main(String[] args) 
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spconfig.xml");
SimpleInterface si=(SimpleInterface)ctx.getBean("id4");
try{
	si.simpleMethod();
}catch(Exception e)
		{}
	}
}
