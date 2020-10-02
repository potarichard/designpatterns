package template_pattern;

public abstract class BasicEngineering 
{
	 public void Papers()
	 {
		 Math();
		 SoftSkills();
		 
		 SpecialPaper();
		 
		 if( studentWantsToBeMaster() )
		 {
			 wantToMaster();
		 }
	 }
	 
	 
	 private void Math()
	 {
		 System.out.println("Mathematics");
	 }
	 private void SoftSkills()
	 {
		 System.out.println("SoftSkills");
	 }
	 
//	 ezt a kiterjeszto oszrtalyok maskepp definialjak, 
//	 de maga a Papers method ugyan olyan (ugyan az)
	 public abstract void SpecialPaper();
	 
	 public abstract void wantToMaster();
	 boolean studentWantsToBeMaster() { return true; }
	 
}
