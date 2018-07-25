package sv.edu.spring.annotations.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype") // singleton prototype request session global-session
public class HelloWorldAnnotation implements  InitializingBean, DisposableBean {
	
	@Value("Hello World Annotation ! ")
	private String message;
	@Value("1")
	private int instance;

	@PostConstruct
	public void initMethod () {
		//System.out.println("The bean Annotation starts");
	}
	
	@PreDestroy
	public void destroyMethod () {
		//System.out.println("The bean Annotation dispose");
	}
	
	public String getMessage() {
		return message+instance;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getInstance() {
		return instance;
	}

	public void setInstance(int instance) {
		this.instance = instance;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}
	

}
