package bridge_pattern_goodexample;

public class Main {

	public static void main(String[] args) {
		
//		artist resource with 2 views
		Resource art_res = new ResourceArtist("Tom Haikiden");
		
		View long_view  = new ViewLongForm(art_res);		
		View short_view = new ViewShort(art_res);	
		String html_1 = long_view.show();
		String html_2 = short_view.show();
		
		System.out.println(html_1);
		System.out.println(html_2);
		
//		book resource with 2 views
		Resource book_res = new ResourceBook("Shadowlands");
		
		View long_view_1  = new ViewLongForm(book_res);		
		View short_view_1 = new ViewShort(book_res);	
		String html_3 = long_view_1.show();
		String html_4 = short_view_1.show();
		
		System.out.println(html_3);
		System.out.println(html_4);
	}

}
