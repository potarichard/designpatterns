package prototype_pattern;

import java.util.Random;

public class BasicCar implements Cloneable
{
	 public String modelname;
	 public int price;

	 public String getModelname()
	 {
		 return modelname;
	 }
	 
	 public void setModelname(String modelname)
	 {
		 this.modelname = modelname;
	 }

	 public static int setPrice()
	 {
		 int price = 0;
		 Random r = new Random();
		 int p = r.nextInt(100000);
		 price = p;
		 return price;
	 }
	 
	 public BasicCar clone()
	 {
		 try 
		 {
			return (BasicCar)super.clone();
		 } 
		 catch (CloneNotSupportedException e) 
		 {
			e.printStackTrace();
		 }
		 
		return null;
	 }
}
