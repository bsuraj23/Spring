public class Car implements Vehicle
{
	private String fuelType;
	private int maxSpeed;
	public void setFuelType(String fuelType)
	{
		this.fuelType=fuelType;
	}
	public void setMaxSpeed(int maxSpeed)
	{
		this.maxSpeed=maxSpeed;
	}
	public void move()
	{
		System.out.println("fuelType:"+fuelType);
				System.out.println("max speed:"+maxSpeed);
		System.out.println("car started happy journy");
	}

}