package structure;

public class Car {
	// 멤버변수
	// 자동차 모델, 가격, 주인
	public String model;
	public int price;
	public String owner;
	
	// 멤버 메서드
	// getInfo()로 모델, 가격, 주인에 대해 조회하도록 작성해주세요.
	public void getInfo() { // 실행 시 힙에 저장된 모델, 가격, 주인을 출력하고 다시 돌아간다.
		System.out.println("모델 : " + model + ", 가격 : " + price + ", 주인 : " + owner);
	} // 더 할게 없으면 getInfo()를 호출한 곳으로 다시 돌아간다.

}
