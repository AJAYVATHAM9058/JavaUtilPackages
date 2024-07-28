//Java program to create arraylist of objects

package ArrayList;
import java.util.*;


class Person{
	private String name;
	private int age;
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		
		return "\n name : "+name+" \n Age : "+age+" \n ";		
				
	}
	
}


public class ArrayListObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Person> people = new ArrayList<>();
		people.add(new Person("Ajay",23));
		people.add(new Person("Mahesh",25));
		people.add(new Person("Rahul",24));
		people.add(new Person("Vinod",22));
		people.add(new Person("Gopi Krishna",29));
		
		System.out.println(people);
		
		//Sorting the people by their age
		people.sort((person1, person2) -> {
			return person1.getAge() - person2.getAge();
		} );
		
		System.out.println(people);
		
		//More concise way of writing the above sorting function
		people.sort(Comparator.comparingInt(Person::getAge));
		System.out.println(people);
		
	}

}
