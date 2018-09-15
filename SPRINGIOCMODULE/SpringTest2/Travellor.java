public class Travellor implements Journey
{
	private Vehicle v;
	public void setV(Vehicle v)
	{
		this.v=v;
	}
	public void startJourney()
	{
		System.out.println("journey started");
		v.move();
	}
}//pojo