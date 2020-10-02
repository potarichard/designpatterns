package observer_pattern;

public class ObserverPatternEx 
{
	 public static void main(String[] args)
	 {
		 System.out.println("***Observer Pattern Demo***\n");
		 Observer o1 = new Observer();
		 Subject sub1 = new Subject();
		 sub1.register(o1);
		 System.out.println("Setting Flag = 5 ");
		 sub1.set_flag(5);
		 System.out.println("Setting Flag = 25 ");
		 sub1.set_flag(25);
		 sub1.unregister(o1);
		 //No notification this time to o1 .Since it is unregistered.
		 System.out.println("Setting Flag = 50 ");
		 sub1.set_flag(50);
		 
		 BetterObserver bo = new BetterObserver();
		 sub1.register(bo);
		 sub1.set_flag(56);
		 
		 sub1.unregister(bo);
		 sub1.set_flag(5632);
		 
		 System.out.println("-----------------------");
		 
		 BestObserver bsto = new BestObserver(sub1);
		 
		 sub1.register(bsto);
		 
		 sub1.setMessage("new updated 24324 message");
	 }
}
