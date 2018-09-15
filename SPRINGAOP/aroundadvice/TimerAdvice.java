import org.aopalliance.intercept.*;
public class TimerAdvice implements MethodInterceptor
{
	public Object invoke(MethodInvocation me)throws Throwable
	{
		long x=0,y,z;
		try
		{
		x=System.currentTimeMillis();
		Object o=me.proceed();
			return o;
		}
		finally
		{
			System.out.println("The x value is:"+x);
		y=System.currentTimeMillis();
		z=(y-x)/1000;
		System.out.println("Time Taken="+z+"seconds");
		}
	}
}