package interface1;

// 인터페이스 구현(상속이 아님!) 하기 위해서는
// extends 대신에 implements를 사용합니다.
// 인터페이스 내부의 추상메서드는 무조건 전부 구현해야 합니다.
public class Car implements Vehicle {
	// 자동차라면 가져야하는 변수 설정
	// 현재속도, 현재연료량, 차주
	private int speed;
	private int gas;
	private String name;
	
	// 생성자를 만들어주세요. 차주만 입력받고
	// 나머지 요소는 현재속도 0, 연료량 70을 자동으로 대입해주세요.
	public Car(String name) {
		this.speed = 0;
		this.gas = MAX_GAS;
		this.name = name;
	}

	@Override
	public void accel() {
		// 한 번 가속시 속도가 10씩 늘어나게 해주세요.
		// 연료는 한 번 가속에 1씩 소비됩니다.
		// 단, 속도는 200을 초과할 수 없습니다.
		/*this.speed += 10;
		
		if (this.speed >= 200) {
			this.speed = 200;
			System.out.println("최대속도입니다.");
			return;
		}
		
		this.gas -= 1;
		System.out.println("현재 속도 : " + this.speed + ", 연료 : " + this.gas);*/
		if (speed + INCREASE_SPEED > MAX_SPEED) {
			speed = MAX_SPEED;
			System.out.println("최대속도입니다.");
		} else {
			speed += INCREASE_SPEED;
		}
		gas -= DECREASE_GAS;
		// System.out.println("현재 속도 : " + this.speed + ", 연료 : " + this.gas);
	}

	@Override
	public void breakSpeed() {
		// 한 번 감속시 속도가 10씩 줄어들도록 해주세요.
		// 단 속도가 0 미만이 될 수 없습니다.
		if (speed - DECREASE_SPEED <= MIN_SPEED) {
			speed = MIN_SPEED;
			System.out.println("속도가 0입니다.");
		} else {
			speed -= DECREASE_SPEED;
		}
		// System.out.println("현재 속도 : " + this.speed + ", 연료 : " + this.gas);
	}

	@Override
	public void reFuel() {
		// 연료는 다시 채울때마다 30씩 채워줍니다.
		// 연료 최대량은 70L로 간주하고 70으로 설정합니다.
		if (this.gas + REFUEL_GAS > MAX_GAS) { // 상수를 넣었을때의 장점 1. 최대치 가스라는 표현을 쉽게 할 수 있다.
			this.gas = MAX_GAS; // 2. 업데이트 외었을 경우 고치기가 쉽다.
			System.out.println("가스가 꽉찼습니다.");
		} else {
			this.gas += REFUEL_GAS;
		}
	}

	@Override
	public void showStatus() {
		// 자동차의 속도, 연료량, 차주가 누군지 나오도록 해줍니다.
		System.out.println("현재 속도 : " + this.speed + ", 연료 : " + this.gas + ", 차주 : " + this.name);
	}

}
