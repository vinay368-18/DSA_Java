package gfg.Strings;

public class CamelCaseConversion {

	public static void main(String[] args) {
		
		String s = "i am learning dsa with java";
		System.out.println("Original String:"+s);
		String result = covertToCamel(s);

		System.out.println("After coverting to Camel case:"+result);
	}
	static String covertToCamel(String s) {
		
		String[] arr = s.split("\\s+"); //splits even with multiple spaces
		StringBuilder sb = new StringBuilder();
		sb.append(arr[0]);
		for(int i=1;i<arr.length;i++) {
			String w = arr[i]; //assigns word to w
			sb.append(Character.toUpperCase(w.charAt(0)));
			sb.append(w.substring(1));
		}
		return sb.toString();
	}


}
