package game.polymorphism;

public class Main01 {

	public static void main(String[] args) {
		// Warrior하나, Orc하나를 생성해주세요.
		Warrior w1 = new Warrior("자바크릭");
		Monster o1 = new Orc();
		Monster g1 = new Goblin();
		Monster s1 = new GiantSpider();
		
		// 생성 후 교전까지 해주세요.
		w1.hunt(o1);
		System.out.println("--------------------");
		w1.hunt(o1);
		System.out.println("--------------------");
		w1.hunt(g1);
		System.out.println("--------------------");
		w1.hunt(g1);
		System.out.println("--------------------");
		w1.hunt(s1);
		System.out.println("--------------------");
		w1.hunt(s1);

	}

}
