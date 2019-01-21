package Inheritance;

public class Animal {
	private String Name;
	private int Age;

	Animal(String name, int age) {
		this.Name = name;
		this.Age = age;
	}

	public void walk() {
		System.out.println("Can Walk");
	}

	public void Call() {
		System.out.println("Can Talk");
	}

	public String getName() {
		return Name;
	}

	public int getAge() {
		return Age;
	}
}
