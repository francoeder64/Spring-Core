package sv.edu.spring.xml.beans;

public class TextEditorXML {

	private SpellChecker sp;

	public TextEditorXML(SpellChecker sp) {
		this.sp = sp;
	}

	public void initCorrection() {
		sp.autocorrect();
	}

	public SpellChecker getSp() {
		return sp;
	}

	public void setSp(SpellChecker sp) {
		this.sp = sp;
	}
}
