public class TestBean implements TestInter
{
	
	public void doCalc(int a,int b)
	{
		System.out.println("from TestBean class doCalc()");
		try
		{
			Thread.sleep(5000);
			int c=a/b;
			Thread.sleep(4000);
			System.out.println("Result="+c);
		}
		catch (InterruptedException e)
		{
		}
	}
}