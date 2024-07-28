//Java program to convert String[] to List<String>
package ArrayList;
import java.util.*;
import java.util.Arrays;

public class TestCollection3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strArray = {"Ajay","Anitha","Akhila","Chandrika","Anil"};
		System.out.println("String of array elements are : "+Arrays.toString(strArray));
		
		//converting String[] elements to List<String>
		List<String> list = Arrays.asList(strArray);
		System.out.println("ArrayList elements are : ");
		System.out.println(list);
		
		//printing using for loop
		for(String str : list) {
			System.out.println(str);
		}
		
		//printing using get(index i) method of arraylist
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		
		
		
		
	}

}
