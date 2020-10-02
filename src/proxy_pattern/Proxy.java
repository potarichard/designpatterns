package proxy_pattern;

public class Proxy implements ISubject
{

	Subject subject;
	String crypto;
	
	public Proxy(String crypto) {
		this.crypto = crypto;
	}
	
	@Override
	public void doSomeWork() 
	{		 
		if (subject == null) {
			subject = new Subject(this.crypto);
		}
		
		subject.doSomeWork();
	}

}
