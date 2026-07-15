package gfg.Recursion;

import java.util.*;

class GenerateParentheses{

    public List<String> generateParentheses(int n) {

        List<String> ans = new ArrayList<>();

        if (n % 2 != 0)
            return ans;

        backtrack(ans, "", 0, 0, n / 2);

        return ans;
    }

    static void backtrack(List<String> ans, String s, int open, int close, int max) {

        if (s.length() == max * 2) {
            ans.add(s);
            return;
        }

        if (open < max) {
            backtrack(ans, s + "(", open + 1, close, max);
        }

        if (close < open) {
            backtrack(ans, s + ")", open, close + 1, max);
        }
    }
}