package composite_pattern_betterexample;

public class Todo implements TodoList {

	String text;

	public Todo(String text) {
		super();
		this.text = text;
	}

	@Override
	public String getHTML() {
		return this.text;
	}
	
	
}
