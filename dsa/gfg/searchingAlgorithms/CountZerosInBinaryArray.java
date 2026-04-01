package gfg.searchingAlgorithms;

public class CountZerosInBinaryArray {

    // Function to count number of zeros using Binary Search
    public static int countZeros(int[] arr) {
        int left = 0, right = arr.length - 1;
        int firstZeroIndex = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == 0) {
                firstZeroIndex = mid;   // possible answer
                right = mid - 1;        // search left side
            } else {
                left = mid + 1;         // move right
            }
        }

        // if no zero found
        if (firstZeroIndex == -1) return 0;

        return arr.length - firstZeroIndex;
    }

    public static void main(String[] args) {
        
        int[] arr = {1, 1, 1, 1, 0, 0, 0};

        int result = countZeros(arr);

        System.out.println("Number of zeros: " + result);
    }
}