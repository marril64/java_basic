package game.interaction;

public class Skeleton {
	private int hp;
	private int atk;
		
	public Skeleton() {
		this.hp = 7;
		this.atk = 5;
	}
		
	public void doBattle(int uAtk) {
		this.hp -= uAtk;
		if (this.hp <= 0) {
			// System.out.println("스켈레톤이 사망했습니다.");
			return;
		}
		System.out.println("스켈레톤의 남은 체력 : " + this.hp);
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
