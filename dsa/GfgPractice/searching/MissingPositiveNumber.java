package GfgPractice.searching;

public class MissingPositiveNumber {

    public static void main(String[] args) {

        int[] arr = {0, -10, 1, 3, -20};

        MissingNum obj = new MissingNum();

        int ans = obj.missingNumber(arr);

        System.out.println("Smallest Missing Positive Number: " + ans);
    }
}

class MissingNum {

    public int missingNumber(int[] arr) {

        int i = 0;
        while (i < arr.length) {

            if (arr[i] <= 0 || arr[i] > arr.length) {
                i++;
                continue;
            }

            int correct = arr[i] - 1;

            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }

        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1)
                return i + 1;
        }

        return arr.length + 1;
    }
}