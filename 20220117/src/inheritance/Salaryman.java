package inheritance;

// Person을 상속해서 salaryman을 만들어보세요.
// 샐러리맨은 연봉(salary)를 가집니다.
// getSalaryInfo()로 상태를 초회할 수 있습니다.

// Person 상속
public class Salaryman extends Person {
	
	// 연봉
	public int salary;
	
	// 연봉 조회
	public void getSalaryInfo() {
		System.out.println("이름은 " + name + "입니다. 나이는 " + age + "입니다. 연봉은 " + salary + "입니다.");
	}

}
