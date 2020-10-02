package proxy_pattern;

public class Subject implements ISubject
{
	String crypto;
	
	public Subject(String crypto) {
		System.out.println("this is a really heavy object creation, should only be instatnciated if really needed");
		this.crypto = decode(crypto);
	}
	
	private String decode(String crypto) {
		return crypto+" decoded";
	}

	@Override
	public void doSomeWork() 	{
		System.out.println("I am from concrete subject, crypto length is: " + this.crypto.length());
	}

}
