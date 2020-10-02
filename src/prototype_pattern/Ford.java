package prototype_pattern;

public class Ford extends BasicCar
{
	 public Ford(String m)
	 {
		 modelname = m;
	 }
	 
	 @Override
	 public BasicCar clone()
	 {
		 return (Ford)super.clone();
	 }
}
