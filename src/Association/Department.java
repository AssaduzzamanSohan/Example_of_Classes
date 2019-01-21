package Association;

import java.util.ArrayList;

public class Department {
	private String id;
	private String name;
	private ArrayList<Student> studentList;
	
	public Department(String id, String name, ArrayList<Student> studentList) {
		this.id = id;
		this.name = name;
		this.studentList = studentList;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", studentList=" + studentList + "]";
	}	
}
