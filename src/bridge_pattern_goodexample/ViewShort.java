package bridge_pattern_goodexample;

public class ViewShort extends View {

	public ViewShort(Resource resource) {
		super(resource);
	}

	@Override
	public String show() {
		String body = this.resource.snippet();
		String image = this.resource.image();
		return "div middle " + image + body + " div end";
	}

}
