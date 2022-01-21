package constructor;

public class Main02P204 {

	public static void main(String[] args) {
		// 농구선수를 생성해주세요.
		BasketballPlayer p1 = new BasketballPlayer(168, 100);
		p1.dunkShoot();
		p1.dunkShoot();
		
		// 성공할 수 있는 선수로 생성해주세요.
		BasketballPlayer p2 = new BasketballPlayer(198, 130);
		p2.dunkShoot();
		p2.dunkShoot();

	}

}
