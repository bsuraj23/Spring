public class MotorBike implements Vehicle
{
	private int maxSpeed;
	public void setMaxSpeed(int maxSpeed)
	{
		this.maxSpeed=maxSpeed;
	}
	public void move()
	{
		System.out.println("max speed:"+maxSpeed);
			System.out.println("fuelType is petrol");

		System.out.println("Motorbike is started happy journy");
	}
}