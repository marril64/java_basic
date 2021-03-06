package accessmodifier;

public class Dog { // 정의부
	// 강아지의 정보를 자율적으로 3개 부여해주세요.
	// String name은 고정입니다.
	// 점프 투 자바 꼭 보자!
	private String name;
	private boolean vaccine;
	private int weight;
	private int age;
	
	// 생성자로 강아지 정보를 처리하시되
	// 이름은 무조건 입력받게 해주세요.
	public Dog(String n) {
		name = n;
		vaccine = false;
		weight = 2;
		age = 1;
	}
	
	public void getInfo() {
		System.out.println(name + "의 몸무게는 " + weight + "kg이고, 나이는 " + age + "살 입니다.");
	}
	
	// 수치 정보값이 변경되는 형태의 메서드 하나를 만들어주세요.
	public void vaccine() {
		if (vaccine == true) {
			System.out.println(name + "의 백신 접종이 이미 완료되었습니다.");
		} else {
			vaccine = true;
			System.out.println(name + "에게 백신을 투여합니다.");
		}
	}
	
	// 사료를 먹으면 체중이 증가되는 메서드 하나를 만들어주세요.
	public void feed() {
		weight += 1;
		System.out.println(name + "에게 사료를 먹입니다.");
	}

}
