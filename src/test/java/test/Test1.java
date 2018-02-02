package test;

import java.io.IOException;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import annotation.AspectTest;
import annotation.BeanAnnotation;
import annotation.ConfigTest;
import annotation.ScopeTest;
import aspectTest.Lww;
import aspectTest.Students;
import aspectTest.Testtest;
import bean.BeanTest;
import service.ResourceTest;
import service.ServiceTestImpl;

public class Test1 {

	@Test
	public void test1() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:xml/spring-beans.xml");
		context.start();
		
		BeanTest beanTest = (BeanTest) context.getBean("beanTest");
		System.out.println(beanTest.getName());
		
		ServiceTestImpl serviceTestImpl = (ServiceTestImpl) context.getBean("serviceTestImpl");
		serviceTestImpl.test();
		
		ResourceTest resourceTest = (ResourceTest) context.getBean("resourceTest");
		try {
			resourceTest.resource();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		context.destroy();
	}
	
	@Test
	public void test2() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:xml/spring-annotation-beans.xml");
		context.start();
		
		BeanAnnotation beanAnnotation = (BeanAnnotation) context.getBean("bean");
		beanAnnotation.say("123");
		
		//²âÊÔ×÷ÓÃÓò
		beanAnnotation.has();
		beanAnnotation = (BeanAnnotation) context.getBean("bean");
		beanAnnotation.has();
		
		annotation.ServiceTestImpl serviceTestImpl = (annotation.ServiceTestImpl) context.getBean("serviceTestImpl");
		serviceTestImpl.servicec();
		
		context.destroy();
	}
	
	@Test
	public void test3() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:xml/spring-annotation-beans.xml");
		context.start();
		
		ConfigTest config = (ConfigTest) context.getBean("configtest");
		config.test();
		
		context.destroy();
	}
	
	@Test
	public void test4() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:xml/spring-annotation-beans.xml");
		context.start();
		
		ScopeTest scopeTest = (ScopeTest) context.getBean("scopeTest");
		scopeTest.test();
		
		context.destroy();
	}
	
	@Test
	public void test5() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:xml/spring-beans.xml");
		context.start();
		
		Students lww = (Students) context.getBean("lww");
		lww.s();
		System.out.println("1");
		context.destroy();
	}
	
	@Test
	public void test6() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:xml/spring-annotation-beans.xml");
		context.start();
		
		annotation.Testtest test = (annotation.Testtest) context.getBean("testtest");
		test.test();
		
		context.destroy();
	}
}
