package map1;

import java.util.HashMap;
import java.util.Map;

public class HashMap02P458 {

	public static void main(String[] args) {
		// map 자료형을 이용해 식당 메뉴판을 만들어보겠습니다.
		// key는 음식이름, value는 가격(정수)로 저장해주세요.
		// 메뉴는 5개이상 집어넣어주세요.
		// 메뉴를 3개 조회해서 화면에 출력해주세요.
		
		Map<String, Integer> map = new HashMap<>();
		//  Object, Object 면 모든 자료가 다 들어가지만, 에러가 났을 때 찾기 힘들다는 단점이 있다.
		map.put("치즈라면", 4000);
		map.put("짬뽕", 5000);
		map.put("라볶이", 4000);
		map.put("갈비만두", 4000);
		map.put("돈까스", 6000);
		
		System.out.println(map);
		System.out.println(map.get("짬뽕"));
		System.out.println(map.get("갈비만두"));
		System.out.println(map.get("치즈라면"));

	}

}
