package factory_pattern;

public class FactoryByColor implements Factory{

	@Override
	public Item create(String str) {
		
		switch (str) 
		{
			case "Yellow": return new YellowHammer();	
			case "Blue": return new BlueHammer();
		}
		
		return null;
	}
}
