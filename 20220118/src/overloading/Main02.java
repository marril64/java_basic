package overloading;

public class Main02 {

	public static void main(String[] args) {
		// 알바생 둘을 만들어주세요.
		// 하나는 시급을 15000원으로 해 주시고
		// 다른 하나는 입력 없이 생성해주세요.
		
		// 오전 알바생
		Parttimer p1 = new Parttimer(false, 15000, "커피빈", "신동호");
		System.out.println("---------------------------");
		
		// 오후 알바생
		Parttimer p2 = new Parttimer(true, "커피빈", "신자바");
		System.out.println("---------------------------");
		
		// 시급 5000원을 넣고 파트타이머를 만들어보세요.
		Parttimer p3 = new Parttimer(false, 5000, "투썸플레이스", "김자바");

	}

}
