
//ArrayList methods 

package ArrayList;
import java.util.*;
public class TestCollection4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();
		list.add("Kavya");
		list.add("Indira");
		list.add("Sandhya");  //adding an element to the arraylist   add(T element)
		list.add("Ramya");
		
		System.out.println(list);
		
		list.set(3, "Ajay");  //Setting an element to an arraylist at particular index    set(int index, T element)
 		list.remove(2);        // Removing an element from an arraylist at particular index  remove(int index)
		System.out.println(list);
		System.out.println("element at index 1 "+list.get(1)); // return element of arraylist using index  get(int index)
		System.out.println("Size of the arraylist "+list.size()); // getting size of the arraylist  int size()
		
		//Sorting an arraylist
		Collections.sort(list);
		System.out.println(list);
		
		
	}

}
