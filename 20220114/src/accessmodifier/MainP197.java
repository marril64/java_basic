package accessmodifier;

public class MainP197 {

	public static void main(String[] args) {
		// 전사를 하나 만들고 사냥을 3번 해주세요.
		Warrior w1 = new Warrior("자바크릭");
		// public 요소는 외부지역에서 마음대로 값을 변경할 수 있음.
		// private 요소는 외부지역에서는 절대로 값을 조회하거나 변경할 수 없음.
		// w1.hp = 10000; // public으로 했을 때 <- 와 같이 터무니없는 값을 만들어낼 수도 있다. (게임의 핵같은것)
		w1.hunt();
		w1.hunt();
		w1.hunt(); // 반복문으로 만들수도 있다. 배우자.

	}

}
