package gfg.Stack;

public class BuildingsWithSunlight {

	public static void main(String[] args) {
		int[] arr = {2,5,1,8,3};
		int r = visibleBuildings(arr);
		System.out.println("visible building:"+r);
	}
	static int visibleBuildings(int[] arr) {
		int max=0,count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=max) {
				max = arr[i];
				count++;
			}
		}
		return count;
	}
}
