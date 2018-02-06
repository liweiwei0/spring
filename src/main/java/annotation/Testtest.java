package annotation;

import org.springframework.stereotype.Component;

@Component
public class Testtest {

	@MyAnnotation("abc")
	public String test() {
		System.out.println("Testtest test");
		return "123";
	}
}
