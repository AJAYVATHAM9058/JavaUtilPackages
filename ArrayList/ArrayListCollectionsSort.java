//Java Program to sort the arraylist elements using Collections

package ArrayList;
import java.util.*;
public class ArrayListCollectionsSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>();
		list.add(56);
		list.add(25);
		list.add(5);
		list.add(215);
		list.add(560);
		list.add(12);
		list.add(556);
		list.add(35);
		
		System.out.println("Before Sorting : "+list);
		System.out.println("After Sorting");
		Collections.sort(list);
		System.out.println(list);
		
	}

}
