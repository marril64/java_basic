package polymorphism;

// 부모클래스를 Person으로 가지도록 상속을 해주세요.
public class Student extends Person {
	
	// 학생의 등급인 grade(성적) 변수를 선언합니다.
	public int grade;
	
	// super()를 이용해 Person(부모) 생성자까지 커버하는 생성자를 만들어주세요.
	// name, age, grade까지 모두 입력받습니다.
	// 부모쪽에서 쓸 자원인 name, age는 부모쪽으로 넘겨준 다음
	// grade만 자신이 받아서 씁니다.
	public Student(String name, int age, int grade) {
		super(name, age); // 생성자 안에 super를 만든다. 그림을 그릴땐 부모부터 그린다.
		this.grade = grade;
	}
	
	// 상속받은 showPerson을 활용한 메서드를 추가로 작성해 grade도 찍히게 해주세요.
	public void showPerson() {
		super.showPerson();
		// System.out.println("이름 : " + getName()); <- 이것처럼 해도 된다.
		System.out.println("성적 : " + this.grade);
	}
	
	// "저는 학생입니다." 라고 콘솔에 찍는 showStudent 메서드를 Student에만 작성합니다.
	public void showStudent() {
		System.out.println("저는 학생입니다.");
	}

}
