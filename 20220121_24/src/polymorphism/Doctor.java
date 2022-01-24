package polymorphism;

public class Doctor extends Person {
	
	public int save;
	
	public Doctor(String name, int age, int save) {
		super(name, age);
		this.save = save;
	}
	
	public void showPerson() {
		super.showPerson();
		System.out.println("수술 성공 횟수 : " + this.save);
	}
	
	public void surgery() {
		System.out.println("수술을 시작합니다.");
	}

}
