public class SimpleInterfaceImpl implements SimpleInterface
{
	public void simpleMethod()
	{
		System.out.println("***** This is SimpleMethod() of class"+this.getClass().getName()+"*****");
		throw new RuntimeException();
	}

}