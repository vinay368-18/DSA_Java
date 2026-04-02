package gfg.Strings;

public class StringBuilderExample {

	public static void main(String[] args) {
		//used in single thereded programs and it is faster than String Buffer
		
		StringBuilder s = new StringBuilder();
		
		s.append("I am studing in NMIT");
		s.append(" Bangalore");
		System.out.println("Appending string");
		System.out.println(s);
		System.out.println();
		
		//inserting a substring at position
		s.insert(0,"Junior Student: ");
		System.out.println("After insertion");
		System.out.println(s);
		System.out.println();
		
		//Replacing a substring
		s.replace(0, 15, "Senior Student:");
		System.out.println("After replacing");
		System.out.println(s);
		System.out.println();
		
		
		//deleting a substring
		s.delete(0, 15);
		System.out.println("After deleting");
		System.out.println(s);
		System.out.println();
		
		// Reversing a string
		System.out.println("After reversing");
		System.out.println(s.reverse());
		System.out.println();
		
		
		

	}

}
