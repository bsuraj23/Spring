import java.util.*;
public class TestBean
{
	private DemoBean db;
	private int a;
	private int b;
	private List data;
	public void setA(int a)
	{
		this.a=a;
	}
	public void setB(int b)
	{
		this.b=b;
	}
	public void setDb(DemoBean db)
	{
		this.db=db;
	}
	public void setData(List data)
	{
		this.data=data;
	}
	public void printList()
	{
		Iterator it=data.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().toString());
		}
	}
	public void show()
	{
		System.out.println(a);
				System.out.println(b);
				db.m1();

	}
}