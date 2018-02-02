package annotation;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectTest {

	@Pointcut("execution(* annotation.Testtest.*(..))")
	private void pointcut() {
		System.out.println("AspectTest pointcut");
	}
	
	@Before("pointcut()")
	public void before() {
		System.out.println("AspectTest before");
	}
	
	@After("pointcut()")
	public void after() {
		System.out.println("AspectTest after");
	}
}
