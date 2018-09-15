public class DemoBean
{
	private int eid;
	private String ename;
	public DemoBean(int eid,String ename)
	{
		this.eid=eid;
		this.ename=ename;
	}
	public void show()
	{
		System.out.println(eid);
		System.out.println(ename);
	}
}