package accessmodifier;

public class Main2P197 {

	public static void main(String[] args) {
		// 강아지 생성
		Dog d1 = new Dog("바둑이");
		d1.getInfo();
		
		// 백신
		d1.vaccine();
		d1.vaccine();
		
		// 사료
		d1.feed();
		d1.getInfo();

	}

}
