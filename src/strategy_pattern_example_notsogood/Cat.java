package strategy_pattern_example_notsogood;

public class Cat {

	Animal animal_source = new Animal();		// use animal as field, instead of inherit it, to gain poop method
	
	void meow() {
		System.out.println("MEOooooW");
	}
	
	void poop() {
		animal_source.poop();
	}
}
