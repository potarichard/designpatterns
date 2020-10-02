package strategy_pattern;

public class Context 
{
//	itt a lenyeg hogy az interfeszt nem implementeljuk, hanem fieldkent hasznaljuk!
	 IChoice myC;
	 
	 public void SetChoice(IChoice ic) { myC = ic; }
	 
	 public void ShowChoice(String s1,String s2) 
	 {  
		 myC.myChoice(s1,s2); 
	 }
}
