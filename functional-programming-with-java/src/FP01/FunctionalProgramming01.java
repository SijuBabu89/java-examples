package FP01;

import java.util.List;

import entity.Person;

public class FunctionalProgramming01 {

	public static void main(String[] args) {
		printAllNumbersInListOldMethod(List.of(1,2,3,4,5,3,11,7,5));
		printAllNumbersInListFunctionalProgrammingMethos(List.of(1,2,3,4,5,3,11,7,5,2));
		Person personA = new Person("Siju", "Babu", "09895951345", 31, "Thiruvananthapuram");
		Person personB = new Person("Saju", "Babu", "09745997797", 35, "Neyattinkara");
		Person personC = new Person("Biju", "Babu", "01950838383", 39, "Dubai");
		printAllPersonInListFunctionalProgrammingMethos(List.of(personA, personB, personC));

	}

	private static void printAllNumbersInListOldMethod(List<Integer> numbers) {
		for(int number : numbers) {
			System.out.println(number);
		}
		
	}
	
	private static void printAllNumbersInListFunctionalProgrammingMethos(List<Integer> numbers) {
		System.out.println(numbers.stream());
		numbers.stream().forEach(FunctionalProgramming01 :: print);
	}
	

	private static void printAllPersonInListFunctionalProgrammingMethos(List<Person> persons) {
		persons.stream().forEach(FunctionalProgramming01 :: print);
		
	}
	
	private static void print(int number) {
		System.out.println(number);
	}

	private static boolean print(Person person) {
		System.out.println("################Person Details##################");
		System.out.println("First Name   : "+person.getFirstName());
		System.out.println("Last Name    : "+person.getLastName());
		System.out.println("Age          : "+person.getAge());
		System.out.println("Place        : "+person.getPlace());
		System.out.println("Phone Number : "+person.getPhoneNumber());	
		System.out.println("################################################");
		System.out.println();
		return true;
	}
}
