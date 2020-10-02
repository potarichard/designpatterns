package factory_pattern;

public class WallBuilder implements Item {

	@Override
	public void use() {
		System.out.println("Building walls...");		
	}

}
