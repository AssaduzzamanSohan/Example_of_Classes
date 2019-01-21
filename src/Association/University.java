package Association;

import java.util.ArrayList;

public class University {
	private String name;
	private String location;
	private ArrayList<Department> departmentList;
	private static final int universityCode = 120;

	public University(String name, String location, ArrayList<Department> departmentList) {
		this.name = name;
		this.location = location;
		this.departmentList = departmentList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public ArrayList<Department> getDepartmentList() {
		return departmentList;
	}

	public void setDepartmentList(ArrayList<Department> departmentList) {
		this.departmentList = departmentList;
	}

	public static int getUniversitycode() {
		return universityCode;
	}

	@Override
	public String toString() {
		return "University [name=" + name + ", location=" + location + ", departmentList=" + departmentList
				+ "University Code= " + universityCode + "]";
	}

}
