package GfgPractice.sorting;
import java.util.*;
public class MinimumPlatform {
	public static void main(String[] args) {
		int[] arr = {900, 940, 950, 1100, 1500, 1800};
		int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
		System.out.println("Minimum Platform:"+minPlatform(arr,dep));
	}

	static int minPlatform(int[] arr, int[] dep) {
		int i=0,j=0;
		int curr_pt = 0;
		int max_pt=0;
		Arrays.sort(arr);
        Arrays.sort(dep);
		while(i<arr.length && j<dep.length) {
			if(arr[i]<=dep[j]) {
				curr_pt++;
				max_pt = Math.max(max_pt, curr_pt);
				i++;
			}
			else{
				curr_pt--;
				j++;
			}
			
		}
		return max_pt;
	}
	

}
