import java.util.*;
public class SampleBean
{
	private Map<String,Integer> students;
	private List data;
public void setStudents(Map<String,Integer> students)
	{
	this.students=students;
	}
	public void setData(List data)
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
			System.out.println(me.getKey()+" "+me.getValue());
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