package factory_pattern;

public class FactoryByUsage implements Factory {

	@Override
	public Item create(String str) {
		
		switch (str) 
		{
			case "Wallbuilder": return new WallBuilder();	
			case "Nailer": return new Nailer();
		}
		
		return null;
	}

}
