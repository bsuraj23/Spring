public class TestBean
{
	private int a;
	private int b;
	private SampleBean sb;
	public void setA(int a)
	{
		this.a=a;
	}
	public void setB(int b)
	{
		this.b=b;
	}
	public void setSb(SampleBean sb)
	{
		this.sb=sb;
	}
	public void show()
	{
		sb.m1();
		System.out.println(a);
				System.out.println(b);
	}

}