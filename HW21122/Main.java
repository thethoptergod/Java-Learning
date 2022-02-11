package HW21122;

public class Main {

	public static void main(String[] args) {
		Computer comp1 = new Computer();
		Computer comp2 = new Computer();
		Computer.Options();
		comp1.setName("Area 51 3.0");
		comp2.setName("Area 52 2.0");
		comp1.setYear(2022);
		comp2.setYear(2021);
		comp1.setCost(3499.99);
		comp2.setCost(2699.99);
		System.out.println(comp1.getName());
		System.out.println(comp1.getYear());
		System.out.println(comp1.getCost());
		System.out.println(comp2.getName());
		System.out.println(comp2.getYear());
		System.out.println(comp2.getCost());
		
	}

}
