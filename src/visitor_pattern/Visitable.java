package visitor_pattern;

// a classok elfogadjak a latogatas, es a latogato, 
// a class fieldjeibol szamolgat valamit
public interface Visitable 
{
	public double accept(Visitor visitor);
}
