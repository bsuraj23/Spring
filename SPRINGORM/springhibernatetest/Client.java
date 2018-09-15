import org.springframework.context.*;
import org.springframework.context.support.*;
public class Client 
{
	public static void main(String[] args) 
	{
ApplicationContext context=new ClassPathXmlApplicationContext("spconfig.xml");
Object o=context.getBean("id4");
MyBean ob=(MyBean)o;
Student s=new Student();
s.setStudentId(400);
s.setStudentName("Airtell");
s.setMarks(500);
ob.saveStudent(s);
ob.loadStudents();
	}
}
