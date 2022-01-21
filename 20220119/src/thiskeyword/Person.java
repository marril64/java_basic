package thiskeyword;

public class Person {
	// private으로 사람 정보를 만들어주세요.
	// 이름, 나이, 돈, 전공
	private String name;
	private int age;
	private int money;
	private String major;
	
	// 생성자를 만들어주세요. 4개 항목을 모두 입력받아 대입해줍니다.
	public Person (String name, int age, int money, String major) {
		this.name = name; // this.~는 해당 클래스 내의 변수를 가리킨다.
		this.age = age; // this는 호출될 때에 따라서 명칭이 바뀔수도 있다.
		this.money = money; // 100번지의 money를 getInfo()로 호출하면 이녀석이 튀어나온다.
		this.major = major; // 변수명을 mj로 하는 것 보다 this키워드를 활용하자.
	}
	
	// 이름 나이 소지금액 전공을 콘솔에 찍어주는 getInfo()를 작성해보세요.
	public void getInfo() {
		System.out.println("이름 : " + this.name/*명확하게 하고자 할 때는 this를 넣어도 된다.*/ + ", 나이 : " + age + ", 소지금액 : " + money + ", 전공 : " + major);
	}

}
