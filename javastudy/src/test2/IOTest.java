//package test2;
//
//import java.io.*;
//
//
//public class IOTest {
//
//	public static void main(String[] args) {
//		//FileOutputStream OutputStreamWriter를 활용 a.txt 파일 출력
//		//자바공부 열심히.
//		
//		File file = new File("javastudy/src/test2/a.txt");
//		
//		OutputStream os = new FileOutputStream(file);
//		OutputStreamWriter osw = new OutputStreamWriter(os);
//		
//			
//		osw.write("자바 공부 열심히");
//		
//		osw.flush();
//		osw.close();os.close();
//	
//	}
//}
		
	/*	
		try(
				OutputStream file = new FileOutputStream("src/test2/a.txt");
				OutputStreamWriter output = new OutputStreamWriter(file);
			){
			
			output.write("자바공부 열심히");
		//	output.flush();
		}catch(IOException e) {
			System.out.println(e);
		}finally {
		//	output.close()
		}
		System.out.println("완료");
		
		
		
		
	}

}
*/