package game.interaction;

public class Kovold {
	private int hp;
	private int atk;
		
	public Kovold() {
		this.hp = 5;
		this.atk = 4;
	}
		
	public void doBattle(int uAtk) {
		this.hp -= uAtk;
		if (this.hp <= 0) {
			// System.out.println("코볼트가 사망했습니다.");
			return;
		}
		System.out.println("코볼트의 남은 체력 : " + this.hp);
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
