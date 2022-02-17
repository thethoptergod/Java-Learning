package HW21822;

public class Employee extends Person implements PersonInterface {
	int salaryE;
	Employee(){
		
	}
	Employee(int age, String gender, String name, int salary) {
		super(age, gender, name);
		salaryE = salary;
	}
	public void display() {
		super.display();
	}
	@Override
	public double calculate(int salaryE) {
		return salaryE;
	}
	public void linebreak() {
		System.out.println("----------------");
	}

}
