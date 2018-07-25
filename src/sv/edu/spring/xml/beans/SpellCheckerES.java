package sv.edu.spring.xml.beans;

public class SpellCheckerES implements SpellChecker{

	@Override
	public void autocorrect() {
		System.out.println("voy a corregir este parrafo");
		
	}

}
