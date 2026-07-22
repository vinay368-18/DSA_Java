package gfg.Stack;
import java.util.*;
public class Stack {

	public static void main(String[] args) {
		ArrayDeque<String> s = new ArrayDeque<>();
		s.push("A");
		s.push("B");
		s.push("C");
		s.push("D");
		s.push("E");
		s.push("F");
		System.out.println("Stack:"+s);
		System.out.println("popped elem:"+s.pop());
		System.out.println("stack:"+s);
		
		
	}

}
