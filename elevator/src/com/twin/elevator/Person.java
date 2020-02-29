package com.twin.elevator;

public class Person {

	public String name;
	public int position;
	
	public Person(String name, int position) {
		super();
		this.name = name;
		this.position = position;
	}
	
	public Person(String name) {
		this(name, 0);
	}
	
	public void move() {
		position += 10;
	}

	@Override
	public String toString() {
		return "People[name=" + name + ", position=" + position + "]";
	}
}
