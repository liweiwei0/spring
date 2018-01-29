package annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("bean")
@Scope
public class BeanAnnotation {

	public void say(String str) {
		System.out.println("BeanAnnotation:"+str);
	}
	
	public void has() {
		System.out.println(this.hashCode());
		
	}
}
