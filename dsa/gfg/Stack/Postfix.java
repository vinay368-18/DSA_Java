package gfg.Stack;
import java.util.*;
public class Postfix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = {'2', '3', '1', '*', '+', '9', '-'};
		int r = evaluatePostfix(arr);
		System.out.println("result:"+r);
	}
	static int evaluatePostfix(char[] arr) {
		ArrayDeque<Integer> s = new ArrayDeque<>();
		for(char ch:arr) {
			if((ch-'0' >= 0) && (ch-'0'<= 9))
				s.push(ch-'0');
			else {
				int op2 = s.pop();
				int op1 = s.pop();
				int result=0;
				switch(ch) {
				case '+':
					result = op1+op2;
					break;
				case '-':
					result = op1-op2;
					break;
				case '*':
					result = op1*op2;
					break;
				case '/':
					result = op1/op2;
					break;
				case '%':
					result = op1%op2;
					break;
				}
				s.push(result);
			}
		}
		return s.pop();
	}
}
