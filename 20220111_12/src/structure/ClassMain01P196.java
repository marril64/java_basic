package structure;

public class ClassMain01P196 {
	
	// PersonClass를 조회할 메서드는 작성할 필요가 없습니다.
	// 이미 PersonClass 내부에 필요한 메서드를 작성해놨기 때문입니다.

	public static void main(String[] args) {
		// 사람을 두 명 만들어보세요(PersonClass)
		PersonClass a = new PersonClass();
		a.name = "신동호";
		a.age = 34;
		a.glasses = true;
		a.height = 168;
		a.pNum = "01012345678";
		a.uNum = 64;
		
		PersonClass b = new PersonClass();
		b.name = "사공율";
		b.age = 35;
		b.glasses = false;
		b.height = 176;
		b.pNum = "01078946512";
		b.uNum = 32;
		
		// 만든 사람 두 명의 정보를 콘솔에 찍어보세요.
		a.getInfo();
		b.getInfo();

	}

}
