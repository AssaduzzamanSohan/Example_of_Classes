package Inheritance;

public class Human extends Animal {
	Human(String name, int age) {
		super(name, age);
	}
	
	public void in_human_class() {
		System.out.println("Human Can think is Printing From Human Class...");
	}

}
