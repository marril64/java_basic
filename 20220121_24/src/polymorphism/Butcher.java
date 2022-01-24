package polymorphism;

public class Butcher extends Person {

	public int kill;
	
	public Butcher(String name, int age, int kill) {
		super(name, age);
		this.kill = kill;
	}
	
	public void showPerson() {
		super.showPerson();
		System.out.println("도축 횟수 : " + this.kill);
	}
	
	public void slaughter() {
		System.out.println("도축을 합니다.");
	}
}
