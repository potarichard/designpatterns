package adapter_pattern;

// egyelore csak negyszg teruletet tud szamolni
public class Calculator 
{
	 Rect rectangle;
	 
	 public double getArea(Rect r)
	 {
		 rectangle=r;
		 return rectangle.l * rectangle.w;
	 }
}
