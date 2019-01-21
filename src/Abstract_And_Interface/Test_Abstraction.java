package Abstract_And_Interface;

public abstract class Test_Abstraction {
	private String name, legs, mouth, eyes;
	private int age;

	public Test_Abstraction(String name, int age, String legs, String mouth, String eyes) {
		this.name = name;
		this.age = age;
		this.legs = legs;
		this.mouth = mouth;
		this.eyes = eyes;
	}

	public abstract void call();

	public void move() {
		System.out.println("moving...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLegs() {
		return legs;
	}

	public void setLegs(String legs) {
		this.legs = legs;
	}

	public String getMouth() {
		return mouth;
	}

	public void setMouth(String mouth) {
		this.mouth = mouth;
	}

	public String getEyes() {
		return eyes;
	}

	public void setEyes(String eyes) {
		this.eyes = eyes;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Abstraction [name=" + name + ", legs=" + legs + ", mouth=" + mouth + ", eyes=" + eyes + ", age=" + age
				+ "]";
	}
}
