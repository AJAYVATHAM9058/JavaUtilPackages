//Java program to access arrayList elements 

package ArrayList;

import java.util.*;
public class AccessArrayListElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> topCompanies = new ArrayList<>();
		
		//Checking if arraylist is empty
		System.out.println("Is topCompanies list is Empty ?: "+topCompanies.isEmpty());
		
		topCompanies.add("Google"); //adding elements to arraylist
		topCompanies.add("Microsoft");
		topCompanies.add("Amazon");
		topCompanies.add("TCS");
		topCompanies.add("Wipro");
		topCompanies.add("Cognizant");
		topCompanies.add("HCL");
		topCompanies.add("Facebook");
		topCompanies.add("Apple");
		
		//finding arraylist size
		System.out.println("Here are the "+topCompanies.size()+"  top Companies in the world. ");
		System.out.println(topCompanies);
		
		//Retrieving the element at given index
		System.out.println("First top Company : "+topCompanies.get(0));
		System.out.println("Second top Company : "+topCompanies.get(1));
		
		//Modifying the element at given index
		
		topCompanies.set(2, "Walmart"); 
		System.out.println("After modifying the Arraylist");
		System.out.println(topCompanies);
		

	}

}
