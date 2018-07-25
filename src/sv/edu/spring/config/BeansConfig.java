package sv.edu.spring.config;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import sv.edu.spring.annotations.beans.HelloWorldAnnotation;
import sv.edu.spring.annotations.beans.JavaCollectionAnnotation;
import sv.edu.spring.annotations.beans.SpellChecker;
import sv.edu.spring.annotations.beans.SpellCheckerES;
import sv.edu.spring.annotations.beans.TextEditorAnnotation;

@Configuration
@ComponentScan("sv.edu.spring")
//@Import({BeansConfig.class,BeansConfigImport.class})
public class BeansConfig {

	//@Bean(initMethod = "", destroyMethod = "")
	@Bean
	public JavaCollectionAnnotation javaCollectionAnnotation() {
		return new JavaCollectionAnnotation();
	}

	@Bean
	public List<?> addressList() {
		return Arrays.asList(new String[] { "SV", "US", "ES" });
	}

	@Bean
	public Set<?> addressSet() {
		return new HashSet<>(Arrays.asList("SV", "US", "ES"));
	}

	@Bean
	public Map<?, ?> addressMap() {
		return new HashMap<String, String>() {
			private static final long serialVersionUID = -9168098875398979232L;
			{
				put("SV", "SV");
				put("US", "US");
				put("ES", "ES");
			}
		};

	}
	
	@Bean
	public Properties addressProp() {
		Properties prop = new Properties();
		prop.put("SV", "SV");
		prop.put("US", "US");
		prop.put("ES", "ES");
		return prop ;
	}


	// @Bean(initMethod="init",destroyMethod="destroy")
	@Bean
	public HelloWorldAnnotation helloWorld1() {
		HelloWorldAnnotation hello = new HelloWorldAnnotation();
		// hello.setMessage("hello world configuration");
		return hello;
	}

	/*
	 * @Bean public InitHelloWorld initHelloWorld () { return new InitHelloWorld();
	 * }
	 */

	@Bean
	public TextEditorAnnotation textEditorAnnotation() {
		return new TextEditorAnnotation(spellChecker());
	}

	@Bean
	public SpellChecker spellChecker() {
		return new SpellCheckerES();
	}

	/*
	 * @Bean public HelloWorldAnnotation helloWorld2 () { HelloWorldAnnotation hello
	 * = new HelloWorldAnnotation();
	 * //hello.setMessage("hello world configuration"); return hello; }
	 */
}
