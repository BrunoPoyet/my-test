package com.twin.elevator;

public class MyMain {

	public static void main(String[] args) {
		System.out.println("hello Romain!");
		People p1 = new People(25);
		System.out.println("age=" + p1.age);
		People p2 = p1;
		p2.age *= 2;
		System.out.println("age=" + p1.age);
		System.out.println("age=" + new People(10).age);
		System.out.println(new People(10) + " " + p1 + " " + p2);
		System.out.println(p2.toString());
		p1.f(10);
		p1.g(10);
		People.g(45);
	}

}
