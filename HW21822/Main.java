package HW21822;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int eage;
		int esalary;
		String egender;
		String ename;
		int sage;
		String sgender;
		String sname;
		String smajor;
		Person1 person = new Person1();
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter Person Name: ");
			person.setName(scan.next());
			System.out.println("Enter Person Age: ");
			person.setAge(scan.nextInt());
			System.out.println("Enter Person Gender: ");
			person.setGender(scan.next());
			System.out.println("Enter CEO Name: ");
			ename = scan.next();
			System.out.println("Enter CEO Age: ");
			eage = scan.nextInt();
			System.out.println("Enter CEO Gender: ");
			egender = scan.next();
			System.out.println("Enter CEO Salary: ");
			esalary = scan.nextInt();
			Employee CEO = new Employee(eage, egender, ename, esalary);
			System.out.println("Enter Student Name: ");
			sname = scan.next();
			System.out.println("Enter Student Age: ");
			sage = scan.nextInt();
			System.out.println("Enter Student Gender: ");
			sgender = scan.next();
			System.out.println("Enter Student Major: ");
			smajor = scan.next();
			Student stud1 = new Student(sage, sgender, sname, smajor);
			CEO.linebreak();
			System.out.println(person.getName());
			System.out.println(person.getAge());
			System.out.println(person.getGender());
			CEO.linebreak();
			System.out.println(PersonInterface.ORGANIZATION);
			CEO.linebreak();
			CEO.display();
			System.out.println(CEO.calculate(esalary));
			CEO.linebreak();
			stud1.display();
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		

	}

}
