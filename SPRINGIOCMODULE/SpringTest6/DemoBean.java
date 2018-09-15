public class DemoBean
{
	private String uname,pwd;
	public DemoBean(String uname,String pwd)
	{
		this.uname=uname;
		this.pwd=pwd;
	}
	public void show()
	{
		System.out.println(uname);
		System.out.println(pwd);
	}
};