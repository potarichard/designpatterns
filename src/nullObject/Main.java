package nullObject;

import java.util.HashMap;
import java.util.Map;

public class Main {

	static Map<Integer, User> users = new HashMap<Integer, User>();
	
	public static void main(String[] args) {
		
		
		users.put(1, new User(1, "Bob"));
		users.put(2, new User(2, "John"));
		
		User u1 = getuser(1);
		User u2 = getuser(2);
		User u3 = getuser(3);
		
		System.out.println(u1.name);
		System.out.println(u2.name);
		System.out.println(u3.name);		// dont have to worry about null checks, it wont return null, it get a default value
	}
	
	static User getuser(Integer id) {
		if(users.containsKey(id))
			return users.get(id);
		
		return new NullUser(-1, "Guest");
	}

}
