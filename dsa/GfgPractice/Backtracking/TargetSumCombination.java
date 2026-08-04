package GfgPractice.Backtracking;
import java.util.*;
public class TargetSumCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3};
		int target = 5;
		ArrayList<ArrayList<Integer>> list = targetSumComb(arr,target);
		System.out.println(list);
	}
	 static ArrayList<ArrayList<Integer>> targetSumComb(int[] arr, int target) {
	        // code here
	        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
	        ArrayList<Integer> curr = new ArrayList<>();
	        backtracking(arr,list,curr,0,target);
	        return list;
	 }
	 static void backtracking(int[] arr,ArrayList<ArrayList<Integer>>list,ArrayList<Integer>curr,int index,int target) {
		 if(target == 0) {
			 list.add(new ArrayList<>(curr));
			 return;
		 }
		 if(index == arr.length || target<0)
			 return;
	
		 curr.add(arr[index]);
		 backtracking(arr,list,curr,index,target-arr[index]);
		 
		 curr.remove(curr.size()-1);
		 backtracking(arr,list,curr,index+1,target);
		 
	 }
	 

}
