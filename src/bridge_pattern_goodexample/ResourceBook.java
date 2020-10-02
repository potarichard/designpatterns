package bridge_pattern_goodexample;

public class ResourceBook implements Resource {

	String book;
		
	public ResourceBook(String book) {
		super();
		this.book = book;
	}

	@Override
	public String snippet() {		
		return " - " + book;
	}

	@Override
	public String image() {		
		return "book.img";
	}


	@Override
	public String title() {
		return "book.title";
	}

	@Override
	public String url() {
		return "book.url";
	}

}
