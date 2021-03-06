package Interaction;

public class Seller {
	// 변수로 int money(매출), int mango(재고)를 가집니다.
	private int money; // 매출액
	private int mango; // 재고(개수)
	private int MANGO_PRICE; // 상수같은경우는 CamelCase로 작성하지 않고 대문자로...띄어쓰기 대신 _로..
	
	// 생성자에서 money는 초기값이 0이고, mango는 입력받도록 해주세요.
	public Seller(int mango) {
		this.money = 0;
		this.mango = mango;
		this.MANGO_PRICE = 5000; // 같은 숫자를 써도 무슨 의미인지 유추할 수 있게 작성하는게 중요하다.
	}
	
	// showSeller()를 이용해 현재 소지금, 망고 개수를 조회하도록 메서드를 작성해주세요.
	public void showSeller() {
		//System.out.println("------------------------------------------------------");
		System.out.println("상인 소지금 : " + this.money + ", 망고 재고 : " + this.mango);
	}
	
	// sellMango(int mango)를 이용해서 망고개수를 입력받으면
	// 자신의 망고는 입력받은 망고개수만큼 차감하고, this.money는
	// 망고갯수 * 망고가격만큼 증가하게 해주세요.
	public void sellMango(int mango) { // 100번지의 sellMango(망고개수)!
		// 망고가 모자랄시 "망고가 모자랍니다" 라고 하고 메서드를
		// return;을 마지막에 적어 강제종료시켜주세요.
		
		if (this.mango < mango) {
			System.out.println("망고가 모자랍니다. 현재 재고 : " + this.mango);
			return;
		}
		
		this.money += mango * this.MANGO_PRICE;
		this.mango -= mango;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	// Buyer측에서 Seller의 망고개수를 조회하도록 게터 생성
	public int getMango() {
		return this.mango;
	}

	public void setMango(int mango) {
		this.mango = mango;
	}

	public int getMANGO_PRICE() {
		return MANGO_PRICE;
	}

	public void setMANGO_PRICE(int mANGO_PRICE) {
		MANGO_PRICE = mANGO_PRICE;
	}
	
}
