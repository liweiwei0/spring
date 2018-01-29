package service;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

public class ResourceTest implements ApplicationContextAware {

	private ApplicationContext context;
	
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
        this.context = arg0;
	}

	public void resource() throws IOException {
		Resource resource = (Resource) context.getResource("file:F:\\myeclipse\\workspace\\SpringTest Maven Webapp\\src\\main\\resources\\txt/resource.txt");
		System.out.println(resource.getFilename());
		System.out.println(resource.contentLength());
	}
}
