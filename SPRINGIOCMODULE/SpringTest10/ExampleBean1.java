public class ExampleBean1
{
	private ExapleBean2 eb2;
	public void setEb2(ExapleBean2 eb2)
	{
		this.eb2=eb2;
	}
	public void show()
	{
		eb2.m1();
	}
}