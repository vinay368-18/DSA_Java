package gfg.SortingAlgorithms;


import java.util.Arrays;

public class MergeWithoutExtraSpace {

    public static void merge(int[] a, int[] b) {

        int n = a.length;
        int m = b.length;

        int gap = (n + m + 1) / 2;

        while (gap > 0) {

            int i = 0;
            int j = gap;

            while (j < n + m) {

                int val1 = get(a, b, n, i);
                int val2 = get(a, b, n, j);

                if (val1 > val2) {
                    set(a, b, n, i, val2);
                    set(a, b, n, j, val1);
                }

                i++;
                j++;
            }

            if (gap == 1) break;
            gap = (gap + 1) / 2;
        }
    }

    static int get(int[] a, int[] b, int n, int index) {
        if (index < n) return a[index];
        return b[index - n];
    }

    static void set(int[] a, int[] b, int n, int index, int value) {
        if (index < n) a[index] = value;
        else b[index - n] = value;
    }

    public static void main(String[] args) {

        int[] a = {1, 4, 7, 8, 10};
        int[] b = {2, 3, 9};

        merge(a, b);

        System.out.println("Array a: " + Arrays.toString(a));
        System.out.println("Array b: " + Arrays.toString(b));
    }
}