package accessmodifier;

public class Main01 {

	public static void main(String[] args) {
		// Magician을 하나 생성해주세요.
		Magician m1 = new Magician("자바크릭"); // Magician으로 넘어갈때 자바크릭도 같이 넘어간다는걸 잊지 말아야한다.
		
		// getInfo()로 정보를 조회해주세요.
		m1.getInfo();
		// m1.getHp(); <- 이런 식으로도 접근이 가능하다.
		// m1.setHp(7); 위험...
		
		// hunt()를 2번 호출해 사냥을 2번 해주세요.
		m1.hunt();
		m1.hunt();
		
		// 사냥이 끝나고 다시 getInfo()를 해주세요.
		m1.getInfo(); // 사용자 입장에서는 바뀐게 없다.
		
		m1.fireball();
		m1.getInfo();
		
		/*Warrior w1 = new Warrior("Soprano");
		w1.getInfo();
		
		w1.hunt();
		w1.hunt();
		w1.getInfo();
		
		w1.doubleAttack();
		w1.getInfo();*/

	}

}
