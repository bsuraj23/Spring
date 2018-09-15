public class DemoBean
{
	private SampleBean sb;
	public DemoBean(SampleBean sb)
	{
		this.sb=sb;
	}
	public void show()
	{
		sb.m1();
	}
}