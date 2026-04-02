package gfg.Strings;

public class StringOperations {

	public static void main(String[] args) {
		
		//Immutable Strings
		String fn = "Vinay";
		String name = fn.concat(" Kumar");
		System.out.println("First Name:"+fn);
		System.out.println("Full Name:"+name);
		System.out.println("Once created cannot be changed(immutable) but can be assigned to new string");
		
		//length
		System.out.println("Name:"+name);
		System.out.println("Length:"+name.length());
		
		//To uppercase and lowercase
		System.out.println("Name:"+name.toUpperCase());
		System.out.println("Name:"+name.toLowerCase());
		
		// To fing index of char or substring
		System.out.println("Index of char 'K' :"+name.indexOf("K"));
		System.out.println("Index of substring 'Kumar': "+name.indexOf("Kumar"));
		
		
		// to find char present at particular position starts as 0 to n-1
		System.out.println("Char at index 5: "+name.charAt(4));
		
		//Comparing two strings
		System.out.println("Is firstname and full name same:"+fn.equals(name));
		
		// Trimming white spaces starting and ending of string
		String x = "   I am the Best    ";
		System.out.println("Without trim:"+x);
		System.out.println("With trim:"+x.trim());
		
		
		
		
	}

}
