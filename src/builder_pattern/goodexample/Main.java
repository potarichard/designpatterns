package builder_pattern.goodexample;

public class Main {

	public static void main(String[] args) {


//		able to chain required parameters to build final object
		
	BankAccount account = new BankAccount.Builder(1234L)
	            .withOwner("Marge")
	            .atBranch("Springfield")
	            .openingBalance(100)
	            .atRate(2.5)
	            .build();
	
	BankAccount anotherAccount = new BankAccount.Builder(4567L)
	            .withOwner("Homer")
	            .openingBalance(100)
	            .build();

		System.out.println();
	
	}

}
