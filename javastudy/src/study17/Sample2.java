package study17;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Sample2 {

	public static void main(String[] args) {

		///////////////// BufferedInputStream   이용한 파일의 내용을  읽어오는 예제 입니다.
		try {
			// file open..
			FileInputStream fis = new FileInputStream("c:/temp/java/test/test.txt");
			
//////////////////////////직접 코드를 읽어 파일에 접속 하는 것보다 8192바이트의 버퍼를 이용해서 속도를 증가 시킨다.
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			// 파일의 내용을 byte단위로 읽어옵니다.그래서
			// 읽어서 저장할 버퍼 byte 배열 설정
			byte[] byteBuff = new byte[9999];

			// 파일을 읽고 읽은 크기를 nRLen 에 저장한다.
			int nRLen = bis.read(byteBuff);

			// 출력을 위해서 byte배열을 문자열로 변환
			String strBuff = new String(byteBuff, 0, nRLen);

			// 읽은 내용을 출력 합니다.
			System.out.printf("읽은 바이트수[%d] : \n읽은 내용 %s \n", nRLen, strBuff);

			// 사용이 끝나면 파일 스트림을 닫습니다.
			bis.close();
			fis.close();

		} catch (Exception e) {
			System.out.println("읽을 파일이 없습니다. \n 읽을 파일을 만들어 준다음 실행 하세요.\n");
			System.out.println("c:/temp/java/test/test.txt\n");
		}
		
	}

}

//결과는 :

//읽은 바이트수[160] : 
//읽은 내용 테스트 파일의 내용1
//테스트 파일의 내용2
//테스트 파일의 내용3
//테스트 파일의 내용4
//테스트 파일의 내용5
//테스트 파일의 내용6
//테스트 파일의 내용7
//테스트 파일의 내용8