package aspectTest;

import org.aspectj.lang.ProceedingJoinPoint;

public class Qiemian {

	public void after() {
		System.out.println("Qiemian after");
	}
	
	public void before() {
		System.out.println("Qiemian before");
	}
	
	public void returning() {
		System.out.println("Qiemian returning");
	}
	
	public void throwing() {
		System.out.println("Qiemian throwing");
	}
	
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Qiemian around 1");
		Object obj = pjp.proceed();
		System.out.println("Qiemian around 2");
		return obj;
	}
}
