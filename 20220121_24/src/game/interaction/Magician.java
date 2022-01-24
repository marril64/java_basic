package game.interaction;

public class Magician {
	private int hp;
	private int mp;
	private int atk;
	private int exp;
	private int lv;
	
	public Magician() {
		this.hp = 10;
		this.mp = 15;
		this.atk = 6;
		this.lv = 1;
		this.exp = 0;
	}
		
	public void huntOrc(Orc orc) {
		if (orc.getHp() <= 0) {
			System.out.println("오크가 이미 죽은 상태입니다.");
			return;
		}
			
		orc.doBattle(this.atk);
			
		if (orc.getHp() <= 0) {
			System.out.println("오크를 죽였습니다. 경험치가 10 올라갔습니다.");
			this.exp += 10;
			System.out.println("마법사의 남은 체력 : " + this.hp);
			System.out.println("마법사의 경험치 : " + this.exp);
		} else {
			this.hp -= orc.getAtk();
			System.out.println("마법사의 남은 체력 : " + this.hp);
		}
	}
		
	public void huntSkeleton(Skeleton skeleton) {
		if (skeleton.getHp() <= 0) {
			System.out.println("스켈레톤이 이미 죽은 상태입니다.");
			return;
		}
				
		skeleton.doBattle(this.atk);
				
		if (skeleton.getHp() <= 0) {
			System.out.println("스켈레톤을 죽였습니다. 경험치가 12 올라갔습니다.");
			this.exp += 12;
			System.out.println("마법사의 남은 체력 : " + this.hp);
			System.out.println("마법사의 경험치 : " + this.exp);
		} else {
			this.hp -= skeleton.getAtk(); // 200번지의 getAtk();
			System.out.println("마법사의 남은 체력 : " + this.hp);
		}
	}
		
	public void huntKovold(Kovold kovold) {
		if (kovold.getHp() <= 0) {
			System.out.println("코볼트가 이미 죽은 상태입니다.");
			return;
		}
				
		kovold.doBattle(this.atk);
				
		if (kovold.getHp() <= 0) {
			System.out.println("코볼트를 죽였습니다. 경험치가 11 올라갔습니다.");
			this.exp += 11;
			System.out.println("마법사의 남은 체력 : " + this.hp);
			System.out.println("마법사의 경험치 : " + this.exp);
		} else {
			this.hp -= kovold.getAtk(); // 200번지의 getAtk();
			System.out.println("마법사의 남은 체력 : " + this.hp);
		}
	}
		
	public void huntRabbit(Rabbit rabbit) {
		if (rabbit.getHp() <= 0) {
			System.out.println("토끼가 이미 죽은 상태입니다.");
			return;
		}
				
		rabbit.doBattle(this.atk);
				
		if (rabbit.getHp() <= 0) {
			System.out.println("토끼를 죽였습니다. 경험치가 2 올라갔습니다.");
			this.exp += 2;
			System.out.println("마법사의 남은 체력 : " + this.hp);
			System.out.println("마법사의 경험치 : " + this.exp);
		} else {
			this.hp -= rabbit.getAtk(); // 200번지의 getAtk();
			System.out.println("마법사의 남은 체력 : " + this.hp);
		}
	}
		
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

}
