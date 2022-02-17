package HW21822;

public class Student extends Person {
		String smajor;
	Student(){}
	public Student(int age, String gender, String name, String major) {
		super(age, gender, name);
		smajor = major;
	}
	public void display() {
		super.display();
		System.out.println(smajor);
	}
}
