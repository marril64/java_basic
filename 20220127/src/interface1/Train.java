package interface1;

public class Train implements Vehicle {
	private int speed;
	private int gas;
	private String name;
	
	public Train(String name) {
		this.speed = TMIN_SPEED;
		this.gas = TMAX_GAS;
		this.name = name;
	}

	@Override
	public void accel() {
		if (speed + TINCREASE_SPEED > TMAX_SPEED) {
			speed = TMAX_SPEED;
			System.out.println("최대속도입니다.");
		} else {
			speed += TINCREASE_SPEED;
		}
		gas -= TDECREASE_GAS;
	}

	@Override
	public void breakSpeed() {
		if (speed - TDECREASE_SPEED < TMIN_SPEED) {
			speed = TMIN_SPEED;
			System.out.println("속도가 0입니다.");
		} else {
			speed -= TDECREASE_SPEED;
		}
	}

	@Override
	public void reFuel() {
		if (this.gas + TREFUEL_GAS > TMAX_GAS) {
			this.gas = TMAX_GAS;
			System.out.println("가스가 꽉찼습니다.");
		} else {
			this.gas += TREFUEL_GAS;
		}
	}

	@Override
	public void showStatus() {
		System.out.println("현재 속도 : " + this.speed + ", 연료 : " + this.gas + ", 기관사명 : " + this.name);
	}

}
