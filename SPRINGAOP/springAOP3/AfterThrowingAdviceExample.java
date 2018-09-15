import java.lang.reflect.Method;
import org.aopalliance.intercept.*;
import org.springframework.aop.ThrowsAdvice;
public class AfterThrowingAdviceExample implements ThrowsAdvice
{
	public void afterThrowing(RuntimeException runtimeException)
	{
		System.out.println("******Inside Throws Advice******");
	}
}