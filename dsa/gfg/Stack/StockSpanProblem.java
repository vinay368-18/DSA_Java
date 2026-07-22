package gfg.Stack;

import java.util.*;

public class StockSpanProblem {

    public static void main(String[] args) {

        int[] arr = {100, 80, 90, 120};

        ArrayList<Integer> list = calculateSpan(arr);

        System.out.println("Result: " + list);
    }

    static ArrayList<Integer> calculateSpan(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayDeque<Integer> s = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {

            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            if (s.isEmpty())
                list.add(i + 1);
            else
                list.add(i - s.peek());

            s.push(i);
        }

        return list;
    }
}