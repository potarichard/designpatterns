package command_pattern.bitbetter;

public class Main {

	public static void main(String[] args) {
		
		Receiver_TV tv 			= new Receiver_TV();
		Receiver_Radio radio 	= new Receiver_Radio();
		
		// tv invoker
		Invoker invoker_1 = new Invoker(new OnCommand(tv), new OffCommand(tv), new VolumeUpCommand(tv), new VolumeDownCommand(tv));

		invoker_1.clickOn();
		invoker_1.clickUp();
		invoker_1.clickUp();
		invoker_1.clickDown();
		invoker_1.clickOff();
		
		System.out.println();
		
		// radio invoker
		Invoker invoker_2 = new Invoker(new OnCommand(radio), new OffCommand(radio), new VolumeUpCommand(radio), new VolumeDownCommand(radio));
		
		invoker_2.clickOn();
		invoker_2.clickUp();
		invoker_2.clickUp();
		invoker_2.clickDown();
		invoker_2.clickOff();
		
		System.out.println();
		
		// mixed invoker
		Invoker invoker_mixed = new Invoker(new OnCommand(radio), new OffCommand(radio), new VolumeUpCommand(tv), new VolumeDownCommand(tv));
		
		invoker_mixed.clickOn();
		invoker_mixed.clickOnAgain();
		invoker_mixed.clickUp();
		invoker_mixed.clickUp();
		invoker_mixed.clickDown();
		invoker_mixed.clickOff();
	}

}
