package bridge_pattern_goodexample;

public class ViewLongForm extends View{

	public ViewLongForm(Resource resource) {
		super(resource);
	}

	@Override
	public String show() {
		String body = this.resource.snippet();
		String image = this.resource.image();
		return "header " + image + body + " footer";
	}

}
