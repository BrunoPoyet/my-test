package com.twin.elevator;

public class People {
	public int age;

	public People(int age) {
		super();
		this.age = age + 25;
	}

	@Override
	public String toString() {
		return "Fabulous people [age=" + age + "]";
	}
	
	public void f(int x) {
		System.out.println(age + 100 + x);
	}
	
	public static void g(int x) {
		System.out.println(100 + x);
	}
}
