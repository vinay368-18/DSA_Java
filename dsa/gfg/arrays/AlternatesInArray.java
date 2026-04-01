package gfg.arrays;
import java.util.*;


public class AlternatesInArray {

		public static void main(String[] args) {
			
			ArrayList <Integer> list =  new ArrayList<>();
			list.add(10);
			list.add(20);
			list.add(30);	
			list.add(40);
			list.add(50);
			list.add(60);
			list.add(70);
		
			for(int i=0;i<list.size(); i=i+2) {//prints alternate array elements
				System.out.print(list.get(i)+"  ");	
			}
	
		}
		
}
