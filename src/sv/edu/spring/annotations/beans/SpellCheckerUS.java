package sv.edu.spring.annotations.beans;

import org.springframework.stereotype.Component;

@Component
public class SpellCheckerUS implements SpellChecker{

	@Override
	public void autocorrect() {
		System.out.println("I going to correct this paragraph");
		
	}

}
