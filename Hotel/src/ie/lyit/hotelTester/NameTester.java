package ie.lyit.hotelTester;

import ie.lyit.hotel.*;
import java.util.ArrayList;

public class NameTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Name personA = new Name();
		
		//Set Person A's Name
		personA.setTitle("Mr");
		personA.setFName("Homer");
		personA.setSName("Simpson");
		System.out.print(personA);
	

	Name personB = new Name("Mrs", "Marge", "Simpson");
	
	if (personA.equals(personB))
		System.out.println(personA + " is the same as " + personB);
	else
		System.out.println(personA + " is not same as " + personB);
	if (personA.isFemale())
		System.out.println(personA + " is a female");
	else
		System.out.println(personA + " is not a female");
	
	ArrayList<Name> names = new ArrayList<Name>();
	names.add(new Name("Mr", "Bart", "Simpson"));
	names.add(personA);
	names.add(personB);
	names.trimToSize();
	
	for (Name tempName : names)
		System.out.println(tempName);
	}
	
	public static boolean nameSearch(Name nameSearch, ArrayList<Name> listOfNames)
		{
			return listOfNames.contains(nameSearch);
	
	}
}
