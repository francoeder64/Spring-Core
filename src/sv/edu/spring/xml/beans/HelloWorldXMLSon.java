package sv.edu.spring.xml.beans;

public class HelloWorldXMLSon {

	private String message1;
	private String message2;
	private String message3;
	private int instance;

	public void init() {
		//System.out.println("The bean son XML starts");
	}

	public void destroy() {
		//System.out.println("The bean son XML dispose");
	}

	public String getMessage1() {
		return message1;
	}

	public void setMessage1(String message1) {
		this.message1 = message1;
	}

	public String getMessage2() {
		return message2;
	}

	public void setMessage2(String message2) {
		this.message2 = message2;
	}

	public String getMessage3() {
		return message3;
	}

	public void setMessage3(String message3) {
		this.message3 = message3;
	}

	public int getInstance() {
		return instance;
	}

	public void setInstance(int instance) {
		this.instance = instance;
	}

	public void print() {
		System.out.println(this.message1 + " " + this.message2 + " " + this.message3);
	}
}
