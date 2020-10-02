package composite_pattern_betterexample;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		
		Project project_2 = new Project("Project 2", Arrays.asList(new Todo("todo_3"), new Todo("todo_4")));		
		Project project_1 = new Project("Project 1", Arrays.asList(new Todo("todo_1"), new Todo("todo_2"), project_2));		
		Project project_M = new Project("Main project", Arrays.asList(new Todo("todo_main_1"), new Todo("todo_main_2"), project_1)); 

		String html = project_M.getHTML();
		
		System.out.println(html);
	}

}
