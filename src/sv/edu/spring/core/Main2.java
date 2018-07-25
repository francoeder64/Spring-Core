package sv.edu.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sv.edu.spring.annotations.beans.HelloWorldAnnotation;
import sv.edu.spring.annotations.beans.JavaCollectionAnnotation;
import sv.edu.spring.annotations.beans.TextEditorAnnotation;
import sv.edu.spring.config.BeansConfig;
import sv.edu.spring.xml.beans.HelloWorldXML;
import sv.edu.spring.xml.beans.HelloWorldXMLSon;
import sv.edu.spring.xml.beans.JavaCollectionXML;
import sv.edu.spring.xml.beans.TextEditorXML;

public class Main2 {

	public static void main(String[] args) {
		/*
		 * AbstractApplicationContext contextAnnotation = new
		 * AnnotationConfigApplicationContext(BeansConfig.class); HelloWorldAnnotation
		 * helloAnnotation = contextAnnotation.getBean("helloWorld1",
		 * HelloWorldAnnotation.class); contextAnnotation.registerShutdownHook();
		 * 
		 * AbstractApplicationContext contextXML = new
		 * ClassPathXmlApplicationContext("beans.xml"); HelloWorldXML helloXML =
		 * contextXML.getBean("helloWorld1", HelloWorldXML.class);
		 * 
		 * HelloWorldXMLSon helloXMLSon = contextXML.getBean("helloWorldSon1",
		 * HelloWorldXMLSon.class);
		 * 
		 * helloXML.print();
		 * 
		 * helloXMLSon.print();
		 * 
		 * contextXML.registerShutdownHook();
		 */

		ApplicationContext contextXML = new ClassPathXmlApplicationContext("beans.xml");
		/*
		TextEditorXML textEditorXML = contextXML.getBean("textEditorXML", TextEditorXML.class);
		textEditorXML.initCorrection();
*/
		ApplicationContext contextAnnotation = new AnnotationConfigApplicationContext(BeansConfig.class);
		/*
		TextEditorAnnotation textEditorAnnotation = contextAnnotation.getBean("textEditorAnnotation", TextEditorAnnotation.class);
		textEditorAnnotation.initCorrection();
		*/
		JavaCollectionXML collection = contextXML.getBean("javaCollectionXML", JavaCollectionXML.class);
		
		collection.getAddressList();
		collection.getAddressMap();
		collection.getAddressProp();
		collection.getAddressSet();
		
		JavaCollectionAnnotation collectionAnnotation = contextAnnotation.getBean("javaCollectionAnnotation", JavaCollectionAnnotation.class);
		
		collectionAnnotation.getAddressList();
		collectionAnnotation.getAddressMap();
		collectionAnnotation.getAddressProp();
		collectionAnnotation.getAddressSet();
		
		ConfigurableApplicationContext contextConfigurableXML = new ClassPathXmlApplicationContext("beans.xml");

		contextConfigurableXML.start();
		
		contextConfigurableXML.stop();
	}

}
