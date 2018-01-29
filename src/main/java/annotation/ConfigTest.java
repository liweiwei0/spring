package annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration("configtest")
public class ConfigTest {

	@Value(value="${jdbc.username}")
	private String username;
	
	@Value(value="${jdbc.password}")
	private String password;
	
	public void test() {
		System.out.println("username:"+username);
		System.out.println("password:"+password);
	}
	
}
