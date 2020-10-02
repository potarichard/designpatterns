package command_pattern;

//ide lehetne meg a tobbi vegrehajtando kod tervet irni (commandokat)
//ez az interface adja ki a commandokat, kell egy vevo aki veszi majd ezeket a kommandokat
public class DoCommand implements ICommand
{
//	tudni kell hogy a kommandot kinek kuldi, es sajat magat hajtja vegre az eszkozon, "elkuldi magat"
	 private Receiver receiver;
	 
	 DoCommand(Receiver recv)
	 {
		 receiver=recv;
	 }
	 
	 @Override
	 public void execute()
	 {
//		 a DoCommand konkret kommand, vegrehajtaskor a reciveren a performDo commandot hajtja vegre
		 receiver.performDo();
	 }
}
