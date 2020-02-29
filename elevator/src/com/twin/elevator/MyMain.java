package com.twin.elevator;

import java.util.ArrayList;
import java.util.List;

public class MyMain {

	public static void main(String[] args) {
		System.out.println("hello Romain!");
		List<Person> people = new ArrayList<Person>();
		for (int i = 0; i < 3; i++) {
			Person person = new Person("joe" + "_" + (i + 1), 25 + 5 * i);
			System.out.println(person);
			people.add(person);
		}
		for (int i = 0; i < 2; i++) {
			Person person = new Hero("mary" + "_" + (i + 1), 25 + 5 * i);
			System.out.println(person);
			people.add(person);
		}
		for (int t = 0; t < 10; t++) {
			for (int i = 0; i < people.size(); i++) {
				Person person = people.get(i);
				person.move();
				people.get(i).move();
			}
		}
		System.out.println(people);
	}

}
