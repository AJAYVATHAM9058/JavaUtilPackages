//Java Program to implement comparator interface

package ArrayList;
import java.util.*;

class Person1{
	 private String name;
	 private int age;
	
	Person1(String name,int age){
		this.age = age;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return this.name+"  , "+this.age;
	}
	
	
}

//Helper class implements comparator interface
class sortByName implements Comparator<Person1>{

	@Override
	public int compare(Person1 p1, Person1 p2) {
		// TODO Auto-generated method stub
		return p1.getName().compareTo(p2.getName());
	}
	
}

class sortByAge implements Comparator<Person1>{
	
	@Override
	public int compare(Person1 p1,Person1 p2) {
		return p1.getAge() - p2.getAge();
	}
}



public class ComparatorArraylist  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Person1> Students = new ArrayList<>();
		Students.add(new Person1("Ajay",25));
		Students.add(new Person1("Anil",23));
		Students.add(new Person1("Rakesh",30));
		Students.add(new Person1("Kavya",24));
		Students.add(new Person1("Indira",22));
		Students.add(new Person1("Sandhya",26));
		
		System.out.println("Unsorted ArrayList");
		//System.out.println(Students);
		
		//Iterating over entries to print them
		for(int i=0;i<Students.size();i++) {
			System.out.println(Students.get(i));
		}
		
		System.out.println("\n");
		//Sorting students arraylist by  age
		System.out.println("Sorting using Age");
		Collections.sort(Students,new sortByAge());
		//Iterating over entries to print them
		for(int i=0;i<Students.size();i++) {
			System.out.println(Students.get(i));
		}
		
		System.out.println("\n");
		//Sorting students arraylist by name
		System.out.println("Sorting using Name");
		Collections.sort(Students,new sortByName());
		//Printing the sorted arraylist
		for(int i=0;i<Students.size();i++) {
			System.out.println(Students.get(i));
		}
		
	}

}
