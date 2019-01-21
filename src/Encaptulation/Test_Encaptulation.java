package Encaptulation;

public class Test_Encaptulation {
	
	private String Name;
	private int age;

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age > 0)
			this.age = age;
		else
			System.out.println("Age can't be Negative...");
	}

}
