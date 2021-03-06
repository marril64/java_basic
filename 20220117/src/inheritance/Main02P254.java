package inheritance;

public class Main02P254 {

	public static void main(String[] args) {
		// 여기에 학생 하나와 샐러리맨 하나를 임의로 만들어보세요.
		// 샐러리맨에는 본인 이름과 희망 연봉을 적어주세요.
		// 학생은 그냥 알아서 작성해주세요.
		// 생성한 객체의 정보를 get~~~~Info() 를 이용해 콘솔에도 같이 찍어주세요.
		
		// 샐러리맨
		Salaryman w1 = new Salaryman();
		w1.name = "신동호";
		w1.age = 34;
		w1.salary = 3200;
		
		// 그림 그릴 때 Person과 Salaryman은 독립적인 부분이라고 의식하면서 그려야 한다.
		w1.getSalaryInfo();
		
		// 학생
		Student s1 = new Student();
		s1.name = "김석";
		s1.age = 35;
		s1.stuNum = 84;
		
		// 그림 그릴 때 Person과 Student는 독립적인 부분이라고 의식하면서 그려야 한다.
		// 그림 그릴 때 독립적인 부분이 구분이 명확해야 한다.
		s1.getStuInfo();

	}

}
