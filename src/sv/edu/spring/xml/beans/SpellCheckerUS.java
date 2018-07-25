package sv.edu.spring.xml.beans;

public class SpellCheckerUS implements SpellChecker{

	@Override
	public void autocorrect() {
		System.out.println("I going to correct this paragraph");
		
	}

}
