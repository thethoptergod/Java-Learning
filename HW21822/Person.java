package HW21822;

public class Person{
	String pname;
	String pgender;
	int page;
	public Person() {}
	Person(int age, String gender, String name){
		page = age;
		pname = name;
		pgender = gender;
	}
	public void display() {
		System.out.println(pname);
		System.out.println(pgender);
		System.out.println(page);
	}
	}
