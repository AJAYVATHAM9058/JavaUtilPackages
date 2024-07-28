package ArrayList;

/*Array and List Declarations
 * 
 * 
 * */
import java.util.*;
public class TestCollection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//General ways of creating int and String arrays
		
		int[] intArray1 = new int[10];
		int[] intArray2 = {1,2,3,4,5,6,7,8,9};
		int intArray3[] =  new int[10];
		int []intArray4 = {5,7,8,2,5,5,5,9};
		
		String []stringArray = new String[5];
		String[] stringArray1 = {"Ajay","Anitha","Kavya","Indira"};
		
		//creating list for integer Objects
		List<Integer> list1 = new ArrayList<>();  /*  Empty List, list size not required  */
		List<Integer>list2 = new ArrayList<Integer>();
		List<Integer> list3 = new ArrayList<>();
		
		
		
		//Converting List<Integer> to int[]
		List<Integer>list4 = new ArrayList<>();
		list4.add(5);
		list4.add(56);
		list4.add(51);
		list4.add(65);
		list4.add(95);
		list4.add(6);
		
		System.out.println(list4);
		int[] listInt = new int[list4.size()];
		for(int i=0;i<list4.size();i++) {
			listInt[i] = list4.get(i);
		}
		System.out.println(Arrays.toString(listInt));
		
		
		//converting int[]  to list<Integer>
		int[] intArray5 = {52,6,8,9,54,21,3};
		List<Integer> list5 = new ArrayList<>();
		
		for(int i=0;i<intArray5.length;i++) {
			list5.add(intArray5[i]);
		}
		System.out.println(list5);
		
		
		//Converting list<String> to String[]
		List<String> list6 = new ArrayList<>();
		list6.add("new ArrayList 1");
		list6.add("new ArrayList 2");
		list6.add("new ArrayList 3");
		list6.add("new ArrayList 4");
		list6.add("new ArrayList 5");
		list6.add("new ArrayList 6");
		
		String[] strArray = new String[list6.size()];
		strArray =  list6.toArray(strArray);
		System.out.println(strArray);
		
		
		
	}

}
