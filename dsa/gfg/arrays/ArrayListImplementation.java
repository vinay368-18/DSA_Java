package dsa.gfg.arrays;
import java.util.*;
public class ArrayListImplementation {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(5);
		list.add(7);
		list.add(8);
		list.add(22);
		System.out.println(list);
		list.remove(2); //remove by pos
		System.out.println(list);
		list.remove(Integer.valueOf(22)); //remove by value
		System.out.println(list);
		list.add(2,500);  // add by index
		System.out.println(list);
		

	}

}
