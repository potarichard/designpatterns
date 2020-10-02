package bridge_pattern_goodexample;

public abstract class View {

	protected Resource resource;

	public View(Resource resource) {
		super();
		this.resource = resource;
	}
	
	public abstract String show();
}
