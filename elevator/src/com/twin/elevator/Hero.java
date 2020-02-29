package com.twin.elevator;

public class Hero extends Person {

	public Hero(String name, int position) {
		super(name, position);
	}
	
	public void move() {
		position += 100;
	}

	@Override
	public String toString() {
		return "Hero[name=" + name + ", position=" + position + "]";
	}
}
