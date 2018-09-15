 import org.springframework.context.*;
 import org.springframework.context.support.*;
 public class Client
 {
	 public static void main(String args[])
	 {
 ApplicationContext ctx=new ClassPathXmlApplicationContext("spconfig.xml");
 Object o=ctx.getBean("id7");//returns proxy object
TestInter ti=(TestInter)o;

	Object o1=ctx.getBean("id2");
	SampleBean sb=(SampleBean)o1;

     Object o2=ctx.getBean("id3");
	DemoBean db=(DemoBean)o2;
		 
		 sb.x(ti);
		 System.out.println("-------------------");
		 sb.y(ti);
		 System.out.println("-------------------");
		 db.x(ti);
		 System.out.println("-------------------");
		 ti.bm();

	 }
 }