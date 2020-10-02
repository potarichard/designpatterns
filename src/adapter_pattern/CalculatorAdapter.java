package adapter_pattern;

// megoldja hogy a getarea haromszogre is mukodjon
public class CalculatorAdapter 
{
	 Calculator calculator;
	 Triangle triangle;
	 
	 public double getArea(Triangle t)
	 {
		 triangle = t;
		 
		 calculator = new Calculator();		 
		 Rect r = new Rect();
		 
		 r.l = triangle.b;
		 r.w = 0.5*triangle.h;
		 
		 return calculator.getArea(r);
	 }
}
