
//ArrayList Implements List Interface
/*
 * Supports duplicate elements
 * It Maintains Insertion Order
 * Arraylist supports random access
 * Arraylists are slower when it comes to manipulation, such as addition or removal of elements because it requires shifting of elements
 * Arraylist is not synchronized, It is not thread safe
 * It supports null elements
 * It has numerous method like adding elements, removal of elements, getting the size and checking if list is empty
 * 
 * 
 * */

package ArrayList;

import java.util.*;
public class TestCollection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating an arraylist of String
		ArrayList<String> arr = new ArrayList<>();
		
		List<String> arr1 = new ArrayList<>(); //creating an arraylist using list interface
		
		arr.add("Ajay");  //adding elements to arraylist
		arr.add("Sai Kumar");
		arr.add("Anil");
		arr.add("Kavya");
		arr.add("Anitha");
		
		arr1.add("Meghana");
		arr1.add("Anusha");
		arr1.add("Sravani");
		arr1.add("Renuka");
		
		//printing arraylist elements using Iterator
		Iterator itr = arr.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(arr1); //printing arrlist elements
		System.out.println("\nprinting arraylist elements using for each loop");
		
		for(String str:arr1) {
			System.out.println(str);   
		}

	}

}
