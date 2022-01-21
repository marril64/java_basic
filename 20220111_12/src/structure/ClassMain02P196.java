package structure;

public class ClassMain02P196 {

	public static void main(String[] args) {
		// 차 2대 생성
		Car avante = new Car(); // 우변이 먼저! 힙에 주소와 메서드를 먼저 저장하고 주소값을 스택에 있는 avante에 할당한다.
		avante.model = "아반떼"; // 주소값으로 힙에 저장된 곳으로 찾아가 model을 저장.
		avante.price = 3000; // 위와 동일.
		avante.owner = "신동호";
		
		Car sonata = new Car(); // 여기도 우변이 먼저! 위와 동일하다. 까먹지 말자.
		sonata.model = "소나타";
		sonata.price = 4000;
		sonata.owner = "변민섭";
		
		// 콘솔에 정보 조회하기
		avante.getInfo(); // Car의 getInfo로 갔다가 돌아오고 더 할게 남았는지 찾는다.
		sonata.getInfo(); // 더 할게 남았으니 다시 getInfo로 갔다가 돌아온다.
	} // 더 할게 없으면 스택이 먼저 삭제되고 힙이 삭제된다.

}
