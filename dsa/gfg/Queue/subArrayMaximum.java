package gfg.Queue;
import java.util.*;
public class subArrayMaximum {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
		int k = 3;
		List<Integer> list = new ArrayList<>();
		list = maxOfSubArrays(arr,k);
		System.out.println("Maximum values corresponding to each subarray");
		System.out.println(list);
	}
	static ArrayList<Integer> maxOfSubArrays(int[] arr,int k){
		int i,j,max=0;
		Queue<Integer> q = new LinkedList<>();
		i = 0;
		while(i<=arr.length - k) {
			j = i;
			while(j<i+k) {
				if(arr[j]>max)
					max = arr[j];
				j++;
			}
			q.add(max);
			i++;
		}
		return new ArrayList<Integer>(q);
	}

}
