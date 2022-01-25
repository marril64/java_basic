package game.polymorphism;

public class Warrior {
	// 속성(필드, 변수)값으로 name, hp, mp, atk을 추가해주세요.
	private String name;
	private int hp;
	private int mp;
	private int atk;
	private int exp;
	
	// 생성자로 위에 설정한 필드들을 초기화해주세요.
	// hp는 20, mp는 10, atk는 4로 고정값을 넣어주시고
	// name은 사용자에게 입력받습니다.
	public Warrior(String name) {
		this.name = name;
		this.hp = 20;
		this.mp = 10;
		this.atk = 4;
		this.exp = 0;
	}
	
	// hunt()를 만들어주세요.
	// Monster 타입과 교전이 가능합니다.
	// Monster의 doBattle()을 호출해 자기 데미지를 몬스터에게 넘겨주고
	// 몬스터가 살아있다면 다시 몬스터의 공격력만큼 데미지를 받습니다.
	// 몬스터가 공격 전에 죽어있다면 죽은 몬스터를 공격할 수 없습니다 라고 나오고
	// 몬스터를 죽였다면(몬스터의 체력이 0이하로 내려갔다면) 몬스터를 죽였습니다 라고 나오게 해주세요.
	public void hunt(Monster monster) {
		
		if (monster.getHp() <= 0) {
			System.out.println("죽은 몬스터를 공격할 수 없습니다.");
			return;
		}
		
		monster.doBattle(this.atk);
		
		if (monster.getHp() <= 0) {
			this.exp += monster.getExp();
			System.out.println(this.name + "(이)가 " + monster.getName() + "를 죽였습니다.");
			System.out.println(this.name + "의 경험치 : " + this.exp);
		} else {
			this.hp -= monster.getAtk();
			System.out.println(this.name + "(이)가 " + monster.getName() + "로부터 공격을 받았습니다.");
		}
		System.out.println(this.name + "의 체력이 " + this.hp + "남았습니다.");
		
	}

}
