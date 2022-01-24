package game.interaction;

public class Main02 {

	public static void main(String[] args) {

		Warrior w1 = new Warrior();
		Skeleton s1 = new Skeleton();
		Kovold k1 = new Kovold();
		Rabbit r1 = new Rabbit();
		
		w1.huntSkeleton(s1);
		w1.huntSkeleton(s1);
		System.out.println("------------------------------");
		w1.huntKovold(k1);
		w1.huntKovold(k1);
		System.out.println("------------------------------");
		w1.huntRabbit(r1);
		

	}

}
