package Polymorphism;

public class Polymorphism {

	public void polymorphism() {
		Operation op = new Operation();

		System.out.println("Sum of 2 numbers: "+op.sum(10, 20));
		System.out.println("Sum of 3 numbers: "+op.sum(10, 20, 30));
		System.out.println("Sum of 4 numbers: "+op.sum(10, 20, 30, 40));
		System.out.println("Sum of 5 numbers: "+op.sum(10, 20, 30, 40, 50));
		System.out.println("Sum of 6 numbers: "+op.sum(10, 20, 30, 40, 50, 60));
	}
}
