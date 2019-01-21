package Association;

import java.util.ArrayList;

public class Association {
	public void start(){
		ArrayList<Student> studentList = new ArrayList();
		ArrayList<Department> departmentList = new ArrayList();
		
		
		Student student1 = new Student("2544", "Rakib");
		Student student2 = new Student("4568", "Sakib");
		Student student3 = new Student("2354", "Rigan");
		Student student4 = new Student("2697", "Sezan");
		Student student5 = new Student("2987", "Sifat");
		
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);
		
		
		Department cse = new Department("15", "CSE", studentList);
		Department eee = new Department("11", "EEE", studentList);
		Department ipe = new Department("18", "IPE", studentList);
		Department nfe = new Department("17", "NFE", studentList);
		
		departmentList.add(cse);
		departmentList.add(eee);
		departmentList.add(ipe);
		departmentList.add(nfe);
		
		University university = new University("BUET", "Polashi", departmentList);
		
		System.out.println(university);
	}
}
