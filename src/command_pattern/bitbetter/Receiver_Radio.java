package command_pattern.bitbetter;


public class Receiver_Radio implements Receiver {

	int volume = 5;
	
	@Override
	public void on() {
		System.out.println("Radio is now on");		
	}

	@Override
	public void off() {
		System.out.println("Radio is now off");			
	}

	@Override
	public void up() {
		System.out.println("Radio volume is: " +  ++volume);			
	}

	@Override
	public void down() {
		System.out.println("Radio volume is: " +  --volume);		
	}

	
}
