package composite_pattern_betterexample;

import java.util.List;

public class Project implements TodoList {

	final String title;
	final List<TodoList> todos;
	
	public Project(String title, List<TodoList> todos) {
		super();
		this.title = title;
		this.todos = todos;
	}

	@Override
	public String getHTML() {
		
		String html = "h1 ";
		html += this.title;
		html += " /h1 \n ul";
		
		for(TodoList todo : todos) {
			html += " \n li ";
			html += todo.getHTML();
			html += " /li";
		}
		
		html += " /ul";
		
		return html;
	}
	
	
}
