package game.interaction;

public class Rabbit {
	private int hp;
	private int atk;
		
	public Rabbit() {
		this.hp = 2;
		this.atk = 1;
	}
		
	public void doBattle(int uAtk) {
		this.hp -= uAtk;
		if (this.hp <= 0) {
			// System.out.println("토끼가 사망했습니다.");
			return;
		}
		System.out.println("토끼의 남은 체력 : " + this.hp);
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

}
