import java.util.*;
public class DemoBean
{
	private List data;
	private Map<String,Integer> students;
	DemoBean(Map<String,Integer>students)
	{
		this.students=students;
	}
	DemoBean(List data)
	{
		this.data=data;
	}
	public void printMap()
	{
		Set s=students.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			Map.Entry me=(Map.Entry)it.next();
			System.out.println(me.getKey()+"==="+me.getValue());
		}
	}
	public void printList()
	{
		Iterator it=data.iterator();
		while(it.hasNext())
		{
			Object o=it.next();
			System.out.println(o.toString());
		}
	}
}