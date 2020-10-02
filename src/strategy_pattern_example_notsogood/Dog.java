package strategy_pattern_example_notsogood;

public class Dog {
	
	Animal animal_source = new Animal();		// use animal as field, instead of inherit it, to gain poop method
	
	void bark() {
		System.out.println("WooofWoof");
	}
	
	void poop() {
		animal_source.poop();
	}
}
