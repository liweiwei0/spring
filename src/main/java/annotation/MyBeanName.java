package annotation;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;

public class MyBeanName implements BeanNameGenerator{

	public String generateBeanName(BeanDefinition arg0, BeanDefinitionRegistry arg1) {
		return null;
	}

	public MyBeanName() {
		super();
	}
	
}
