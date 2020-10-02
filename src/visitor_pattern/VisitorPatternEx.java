package visitor_pattern;

// a lényeg, hogy 
// a classok elfogadjak a latogatas, es a latogato, 
// a class fieldjeibol szamolgat valamit
// az accept method meg is hivja a visitet ami elvegzi a kalkulaciot
// jo ez mert modositas nelkul lehet sok class referenciajat atvenni
// es azokon szamolgatni

public class VisitorPatternEx 
{

	public static void main(String[] args) 
	{
		TaxVisitor taxCalc = new TaxVisitor();
		TaxHolidayVisitor taxHolidayCalc = new TaxHolidayVisitor();
		
		Necessity milk = new Necessity(3.47);
		Liquor vodka = new Liquor(11.99);
		Tobacco cigars = new Tobacco(19.99);
		
		System.out.println("Normal PRICES");
		System.out.println(milk.accept(taxCalc) + "\n");
		System.out.println(vodka.accept(taxCalc) + "\n");
		System.out.println(cigars.accept(taxCalc) + "\n");
		
		System.out.println("TAX HOLIDAY PRICES");
		System.out.println(milk.accept(taxHolidayCalc) + "\n");
		System.out.println(vodka.accept(taxHolidayCalc) + "\n");
		System.out.println(cigars.accept(taxHolidayCalc) + "\n");
	}

}
