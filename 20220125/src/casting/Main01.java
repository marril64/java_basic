package casting;

public class Main01 {

	public static void main(String[] args) {
		// Animal 타입은 어떤 자료형이건 받을 수 있습니다.
		// Cat, Dog, Animal을 하나씩 만들어주세요.
		// Animal c1, d1, a1으로 받아주세요.
		
		Animal c1 = new Cat("뭥미", 9); // 힙에 저장된 근본 자료형은 부모자식을 모두 불러올 수 있는 Cat이다.
		Animal d1 = new Dog("메리", 3);
		Animal a1 = new Animal("동물", 1);
		
		// c1, d1, a1에 대해서 .sit()을 각각 호출해보세요.
		c1.sit(); // Animal이 먼저 호출되고, 자식쪽 오버라이딩된 Cat으로 이동한 뒤 실행된다.
		d1.sit();
		a1.sit(); // 타입이 Animal이고 호출된것도 Animal이다.
		
		// 각 자료형의 근본적 자료형에 맞춰서 되돌려보겠습니다.
		Cat cat = (Cat)c1;
		// c1은 Animal타입이나, 힙에 저장된 데이터가 Animal을 포함하고 있는 Cat이므로 Cat으로 변환이 가능함.
		cat.grooming();
		
		// a1은 힙/스택 모두에 Animal로만 저장되어있어 다른 자료형으로 변환이 불가능합니다.
		// Cat cat2 = (Cat)a1; <- 겉보기에 되는 것 처럼 보이지만
		// cat2.grooming();       에러가 발생한다.
		
		Dog dog = (Dog)d1;
		dog.giveHand();

	}

}
