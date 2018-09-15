public class WelcomeBean
{
	public WelcomeBean()
	{
		System.out.println("constructor is called.......");
	}
	private String message;
	public void setMessage(String message)
	{
		this.message=message;
	}
	public String getMessage()
	{
		return message;
	}
	public void show()
	{
		System.out.println(message);
	}
}