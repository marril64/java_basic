package game.interaction;

public class Main03 {

	public static void main(String[] args) {
		Magician m1 = new Magician();
		Archer a1 = new Archer();
		Orc o1 = new Orc();
		Rabbit r1 = new Rabbit();
		Orc o2 = new Orc();
		Rabbit r2 = new Rabbit(); 
		
		m1.huntOrc(o1);
		m1.huntRabbit(r1);
		System.out.println("----------------------------");
		a1.huntOrc(o2);
		a1.huntRabbit(r2);

	}

}
