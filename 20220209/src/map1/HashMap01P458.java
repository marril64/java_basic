package map1;

import java.util.HashMap;
import java.util.Map;

public class HashMap01P458 {

	public static void main(String[] args) {
		// Map 인터페이스의 대표 구현체는 HashMap 입니다.
		// 제네릭 내부에서는 <Key자료형, Value자료형> 으로 작성합니다.
		Map<String, String> map = new HashMap<>();
		
		// 자료추가는 .put(키값, 벨류값); 을 이용합니다.
		map.put("신동호", "자바");
		map.put("최문식", "치킨");
		map.put("도형욱", "튜바");
		System.out.println(map);
		
		// 자료조회시는 .get(key값)으로 조회합니다.
		// map은 키로 벨류를 조회하는건 가능하지만, 역으로 벨류로 키를 조회하는건 불가능합니다.
		// 없는 키값으로 조회하면 null이 나옵니다.
		// 인덱스번호로도 조회할 수 없습니다.
		System.out.println(map.get("신동호"));
		System.out.println(map.get("사공율"));
		
		// remove는 key를 이용해서 key=value 한 쌍을 삭제해줍니다.
		map.remove("도형욱");
		System.out.println(map);
		
		// .size()는 크기를 알려줍니다. 정수로 몇 개의 key=value쌍이
		// 저장되어있는지 확인할 수 있습니다.
		System.out.println(map.size());

	}

}
