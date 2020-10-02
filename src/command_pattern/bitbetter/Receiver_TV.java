package command_pattern.bitbetter;

public class Receiver_TV implements Receiver {

	int volume = 5;
	
	@Override
	public void on() {
		System.out.println("TV is now on");		
	}

	@Override
	public void off() {
		System.out.println("TV is now off");			
	}

	@Override
	public void up() {
		System.out.println("TV volume is: " +  ++volume);			
	}

	@Override
	public void down() {
		System.out.println("TV volume is: " +  --volume);		
	}



}
