class A
{
	private int id;
	private String sname;
	private int a,b,c;
	A(int id,String sname)
	{
		this.id=id;
		this.sname=sname;
	}
	A(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void show()
	{
		System.out.println(id);
		System.out.println(sname);
			}
	public void show1()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}