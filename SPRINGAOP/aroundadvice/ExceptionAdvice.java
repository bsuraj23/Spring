import org.springframework.aop.*;
public class ExceptionAdvice implements ThrowsAdvice
{
	public void afterThrowing(Exception e)
	{
		System.out.println("I am throws advice with Exception parameter");
	}
	public void afterThrowing(ArithmeticException e)
	{
		System.out.println("I am throws advice with ArithmeticException parameter");
	}
public void
afterThrowing(NullPointerException e2)

	{
		System.out.println("I am throws advice with NullpointerException parameter");
	}
}