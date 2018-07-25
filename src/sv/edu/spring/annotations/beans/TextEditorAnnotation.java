package sv.edu.spring.annotations.beans;

import org.springframework.stereotype.Component;

@Component
public class TextEditorAnnotation {

	private SpellChecker sp;

	public TextEditorAnnotation(SpellChecker sp) {
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
