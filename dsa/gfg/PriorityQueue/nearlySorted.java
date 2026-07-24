package gfg.PriorityQueue;

import java.util.*;

public class nearlySorted {

    public static void main(String[] args) {

        int[] arr = {2, 3, 1, 4};
        int k = 2;

        sortNearlySortedArray(arr, k);

        System.out.println("Sorted Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void sortNearlySortedArray(int[] arr, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for (int i : arr)
            q.add(i);

        for (int i = 0; i < arr.length; i++)
            arr[i] = q.poll();
    }
}