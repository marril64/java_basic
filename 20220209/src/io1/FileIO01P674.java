package io1;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO01P674 {

	public static void main(String[] args) throws IOException {
		// 외부에 텍스트파일을 만들기 위해서 FileOutputStream을 사용합니다.
		// 변수를 만들고 거기에 파일 경로를 적습니다.
		// main메서드에 반드시 throws IOException을 작성해야 합니다.
		// FileOutputStream output = new FileOutputStream("c:/io/test.txt"); // new를 이용해서 경로에 파일을 만들자 라고 하는것
		// 실제로 이 경로에 test.txt 파일이 생긴다.
		
		// 간편한 사용을 위해 FileOutputStream 자료형 대신
		// FileWriter 자료형을 쓸 수도 있습니다.
		FileWriter output = new FileWriter("c:/io/test.txt");
		
		// .write("내용") 을 이용해 메모창 내부에 필기할 수 있습니다.
		// 단, 줄바꿈이 자동으로 안 되기 때문에 줄바꿈이 필요한 부분에
		// \n을 추가로 붙여주시면 됩니다.(개행문자 -> 줄을 바꿔주는 문자)
		output.write("오늘은 몸이 이상하게 무겁다.\n그래서 다이어트를 할까 생각했었다.\n멍청한 생각이었다.");
		
		// 해당 텍스트를 파일에 반영하려면 .close()로 종료해주면 됩니다.
		output.close();
	}

}
