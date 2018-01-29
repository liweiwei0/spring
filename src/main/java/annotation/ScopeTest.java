package annotation;

import java.util.List;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ScopeTest {

	@Autowired
	@Named("stringScope1")
	private Scope<String> stringScope;
	
	@Autowired
	private Scope<Integer> integerScope;
	
	@Bean(name="stringScope1")
	public StringScope ss() {
		return new StringScope();
	}
	
	@Bean(name="stringScope2")
	public StringScope2 ss2() {
		return new StringScope2();
	}
	
	@Bean
	public IntegerScope is() {
		return new IntegerScope();
	}
	
	public void test() {
		System.out.println(stringScope);
		System.out.println(integerScope.getClass().getName());
	}
}
