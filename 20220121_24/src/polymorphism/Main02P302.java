package polymorphism;

public class Main02P302 {

	public static void main(String[] args) {
		// Person b1 = new Butcher("신사장", 30, 168);
		// Person d1 = new Doctor("김의원", 34, 202);
		Butcher b1 = new Butcher("신사장", 30, 168);
		Doctor d1 = new Doctor("김의원", 34, 202);
		
		b1.showPerson();
		d1.showPerson();
		System.out.println("-------------------");
		// System.out.println(b1.getAge());
		b1.slaughter();
		d1.surgery();

	}

}
