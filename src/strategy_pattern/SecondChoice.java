package strategy_pattern;

public class SecondChoice implements IChoice
{
	 public void myChoice(String s1, String s2)
	 {
		 System.out.println("You wanted to concatenate the numbers.");
		 
		 System.out.println(" The result of the addition is:"+s1+s2);
	 }
}