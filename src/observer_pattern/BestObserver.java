package observer_pattern;

public class BestObserver implements IObserver{

	Subject subject;
	
	
		
	public BestObserver(Subject subject) {
		super();
		this.subject = subject;
	}



	@Override
	public void update(int i) {
		
		System.out.println(subject.getMessage());
		
	}

}
