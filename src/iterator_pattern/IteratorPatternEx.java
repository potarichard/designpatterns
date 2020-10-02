package iterator_pattern;

// Provide a way to access the elements of an aggregate object sequentially without exposing
// its underlying representation.

// a trukk abban van hogy az artsnal arrayben vannak a cuccok, sciencnel pedig linkedlistben
// de a jo kis interface megoldja hogy iteracio jol menjen (maguknak az implementalaskor
// maguknak megfeleloen iteralnak! ennyi a lényeg

public class IteratorPatternEx 
{

	public static void main(String[] args) 
	{	 
		 
		 ISubject Sc_subject = new Science();
		 ISubject Ar_subjects = new Arts();
		 
		 IIterator Sc_iterator = Sc_subject.CreateIterator();
		 IIterator Ar_iterator = Ar_subjects.CreateIterator();
		 
		 System.out.println("\nScience subjects :");
		 Print(Sc_iterator);
		 
		 System.out.println("\nArts subjects :");
		 Print(Ar_iterator);
	}
	
	 public static void Print(IIterator iterator)
	 {
		 while (!iterator.IsDone())
		 {
			 System.out.println(iterator.Next());
		 }
	 }

}
