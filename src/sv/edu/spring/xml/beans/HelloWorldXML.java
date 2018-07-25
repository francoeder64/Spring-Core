package sv.edu.spring.xml.beans;

public class HelloWorldXML {

	private String message1;
	private String message2;
	private int instance;

	public void init() {
		System.out.println("The bean XML starts");
	}

	public void destroy() {
		System.out.println("The bean XML dispose");
	}

	public int getInstance() {
		return instance;
	}

	public void setInstance(int instance) {
		this.instance = instance;
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

	public void print () {
		System.out.println(this.message1 + " " + this.message2);
	}
	
}
