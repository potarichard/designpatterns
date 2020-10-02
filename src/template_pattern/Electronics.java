package template_pattern;

public class Electronics extends BasicEngineering
{
	 @Override
	 public void SpecialPaper()
	 {
		 System.out.println("Digital Logic and Circuit Theory");
	 }

	@Override
	public void wantToMaster() 
	{
		System.out.println("Must know QuantumPhisics first!");
	}
}
