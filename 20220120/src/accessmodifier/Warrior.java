package accessmodifier;

// Commoner를 상속한 Warrior 클래스를 만들어주세요.
public class Warrior extends Commoner {
	
	public Warrior(String name) {
		super(name);
	}
	
	// 전사는 hunt()를 할 경우 체력이 1 까지고
	// 경험치는 10을 먹습니다.
	public void hunt() {
		System.out.println("전사가 사냥을 시작합니다.");
		setHp(getHp() - 1);
		setExp(getExp() + 10);
	}
	
	// doubleAttack()을 특수스킬로 가지고
	// 사용시 체력은 4씩 까지고 경험치는 25씩 증가합니다.
	public void doubleAttack() {
		System.out.println("2단 컴보!");
		setHp(getHp() - 4);
		setExp(getExp() + 25);
	}
	
	// getInfo()는 Magician과 동일합니다.
	public void getInfo() {
		System.out.println("이름 : " + getName() + ", hp : " + getHp() + ", mp : " + getMp() + ", lv : " + getLv() + ", exp : " + getExp());
	}

}
