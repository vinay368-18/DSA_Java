package dsa.gfg.arrays;
import java.util.*;

public class SearchElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {20,40,60,80,100,120,140};
		int key1 = 60;
		int key2 = 70;
		int result1=search(a,key1);
		int result2=search(a,key2);
		if(result1==-1) {
			System.out.println("Not found");
		}
		else {
			System.out.println(key1+" Found at pos "+result1);
		}
		if(result2==-1) {
			System.out.println("Not found");
		}
		else {
			System.out.println(key2+" Found at pos "+result2);
		}
		
	}
	
	static int search(int[] a,int key) {
		for(int i=0;i<a.length;i++) {
			if(a[i] == key) {
				return i;
			}
		}
		return -1;
	}

}
