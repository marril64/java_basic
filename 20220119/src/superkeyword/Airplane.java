package superkeyword;

public class Airplane {
	// 비행기는 속도를 가집니다.
	protected int speed; // protected로 하는 이유가 있다. private으로 할 때 자식에게 상속이 안되기 때문.
	
	// 생성자는 속도를 입력받아 저장해줍니다.
	public Airplane(int speed) {
		this.speed = speed; // speed가 파란색인지 녹색인지 확인!
	}
	
	// fly()메서드를 정의하는데 속도가 500씩 붙습니다.
	// 단, 일반 비행기는 속도가 900 초과일 수 없습니다.
	public void fly() {
		/*speed += 500;
		if (speed > 900) {
			speed = 900;
		}*/
		if ((this.speed + 500) > 900) { // this는 호출의 주체가 뭐인지에 따라 다르다.
			this.speed = 900; // this같은 경우는 100번지(임의)에 있는 speed를 가리킨다.
		} else {
			this.speed += 500;
		}
		System.out.println("현재 비행기는 시속 " + speed + "km/h로 비행중.");
	}
	
	// breakSpeed() 메서드를 수행하면 속도가 100씩 감속합니다.
	// 단, 브레이크 구동의 최저속도는 0입니다.
	public void breakSpeed() {
		/*speed -= 100;
		if (speed < 0) {
			speed = 0;
		}*/
		if (speed - 100 < 0) {
			speed = 0;
		} else {
			speed -= 100;
		}
		System.out.println("감속결과 " + speed + "km/h 로 비행중.");
	}

}
