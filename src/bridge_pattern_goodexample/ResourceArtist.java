package bridge_pattern_goodexample;

public class ResourceArtist implements Resource{

	String artist;
		
	public ResourceArtist(String artist) {
		super();
		this.artist = artist;
	}

	@Override
	public String snippet() {		
		return "some things " + artist;
	}

	@Override
	public String image() {		
		return "artist.img";
	}


	@Override
	public String title() {
		return "artist.name";
	}

	@Override
	public String url() {
		return "artist.url";
	}

}
