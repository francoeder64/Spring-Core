package sv.edu.spring.core;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sv.edu.spring.config.BeansConfig;
import sv.edu.spring.annotations.beans.HelloWorldAnnotation;
import sv.edu.spring.xml.beans.HelloWorldXML;;

public class Main {

	public static void main(String[] args) {
		
		//ApplicationContext contextXML = new ClassPathXmlApplicationContext("beans.xml");
		//ApplicationContext contextAnnotation = new AnnotationConfigApplicationContext(BeansConfig.class);
		
		//ConfigurableApplicationContext contextXML = new ClassPathXmlApplicationContext("beans.xml");
		ConfigurableApplicationContext contextAnnotation = new AnnotationConfigApplicationContext(BeansConfig.class);
		
		/*
		HelloWorldXML helloXMLA = (HelloWorldXML) contextXML.getBean("helloWorld1");
		System.out.println(helloXMLA.getMessage());
		helloXMLA.setMessage("Another message ");
		System.out.println(helloXMLA.getMessage());
		HelloWorldXML helloXMLB = (HelloWorldXML) contextXML.getBean("helloWorld1");
		System.out.println(helloXMLB.getMessage());
		*/
		
		/*
		HelloWorldXML helloXMLC = (HelloWorldXML) contextXML.getBean("helloWorld2");
		System.out.println(helloXMLC.getMessage());
		helloXMLC.setMessage("Another message ");
		System.out.println(helloXMLC.getMessage());
		HelloWorldXML helloXMLE = (HelloWorldXML) contextXML.getBean("helloWorld2");
		System.out.println(helloXMLE.getMessage());
		*/
		
		HelloWorldAnnotation helloAnnotationF = (HelloWorldAnnotation) contextAnnotation.getBean("helloWorld1");
		System.out.println(helloAnnotationF.getMessage());
		
		helloAnnotationF.setMessage("message changes");
		System.out.println(helloAnnotationF.getMessage());
		
		HelloWorldAnnotation helloAnnotationG = (HelloWorldAnnotation) contextAnnotation.getBean("helloWorld1");
		
		System.out.println(helloAnnotationG.getMessage());
		
		/*
		HelloWorldAnnotation helloAnnotation = (HelloWorldAnnotation) contextAnnotation.getBean("helloWorld");
		System.out.println(helloAnnotation.getMessage());
		*/
		contextAnnotation.close();
		//contextXML.close();
		
	}

}
