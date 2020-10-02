package factory_pattern;

public class Main {

	public static void main(String[] args) {
		
		Factory useitem = new FactoryByUsage();
		Factory coloritem = new FactoryByColor();		 

		Item[] item_1 = new Item[] {useitem.create("Wallbuilder"), useitem.create("Nailer")};
		Item[] item_2 = new Item[] {coloritem.create("Yellow"), coloritem.create("Blue")};
		
		for(Item item : item_1)
			item.use();
		
		for(Item item : item_2)
			item.use();
	}

}
