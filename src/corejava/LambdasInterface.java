package corejava;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class LambdasInterface {

	public static void main(String[] args) {
		List<Person> personList = Arrays.asList(new Person("abc", "Sharma", 54),

				new Person("ghj", "Bhayana", 29), new Person("xys", "Makkar", 30),
				new Person("Himanshu", "Gandhi", 32));

		
		Collections.sort(personList, (o1, o2) -> o1.getlName().compareTo(o2.getlName()));
personList.forEach(p-> System.out.println(p));
		// step 2PersonList createt method that prints all elems
		print(personList, p -> true);

		// step 3 prints all persons contains m
		print(personList, p -> (p.getfName().startsWith("m")));
		// System.out.println(p.toString());
		
		System.out.println(personList.stream().count());
	}

	private static void print(List<Person> p, Predicate<Person> pred) {
		for (Person person : p) {
			if (pred.test(person)) {
				System.out.println(p);
			}
		}
	}
}
