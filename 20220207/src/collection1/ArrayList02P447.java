package collection1;

import java.util.*; // 둘 다 쓰기 귀찮으면 *을 쓴다. (전체 다 import 하겠다는 뜻)
// import java.util.List;

public class ArrayList02P447 {

	public static void main(String[] args) {
		// 여러분이 직접 String 자료를 가변적으로 받을 수 있는
		// ArrayList를 만들어주시고 안쪽에 자료로
		// "사과", "딸기", "망고", "블루베리", "파인애플"을 넣어주세요.
		// 자료가 적재된 ArrayList를 콘솔에 찍어주세요.
		List<String> list2 = new ArrayList<>(); // 반드시 순서가 <> 다음 () 순으로 가야한다.
		
		list2.add("사과");
		list2.add("딸기");
		list2.add("망고");
		list2.add("블루베리");
		list2.add("파인애플");
		
		System.out.println(list2);
		
		// .contains("자료") 는 리스트 내에 찾는 자료가 있으면 true
		// 없다면 false를 출력해준다.
		System.out.println(list2.contains("사과"));
		System.out.println(list2.contains("복숭아"));

	}

}
