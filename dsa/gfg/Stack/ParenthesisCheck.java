package gfg.Stack;
import java.util.*;
public class ParenthesisCheck {
	public static void main(String[] args) {
		String sg = "[()()]{}";
		boolean r = isValid(sg);
		System.out.println("Valid:"+r);
	}
	static boolean isValid(String sg) {
		char[] ch = sg.toCharArray();
		ArrayDeque<Character> s = new ArrayDeque<>();
		for(char c:ch) {
			if(c == '{' || c == '(' || c == '[') {
				s.push(c);
			}
			else {
				if(s.isEmpty())
					return false;
				char top = s.pop();
				if((c=='}'&&top!='{') || (c==']'&&top!='[') || (c==')' && c=='('))
					return false;
			}
		}
		return s.isEmpty();
	}
}
