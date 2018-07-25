package sv.edu.spring.annotations.beans;

import org.springframework.stereotype.Component;

@Component
public class SpellCheckerES implements SpellChecker{

	@Override
	public void autocorrect() {
		System.out.println("voy a corregir este parrafo");
		
	}

}
