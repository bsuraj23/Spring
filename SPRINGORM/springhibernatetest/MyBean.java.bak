import java.util.*;
import org.springframework.orm.hibernate3.*;
public class MyBean
{
	private HibernateTemplate ht;
	public void setHt(HibernateTemplate ht)
	{
		this.ht=ht;
	}
	public void saveStudent(Student s)
	{
		ht.delete(s);
	}
	public void loadStudents()
	{
		List l=ht.loadAll(Student.class);
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			Student s=(Student)it.next();
System.out.println(s.getStudentId()+" "+s.getStudentName()+" "+s.getMarks());
	System.out.println("==============");
		}
	}
}