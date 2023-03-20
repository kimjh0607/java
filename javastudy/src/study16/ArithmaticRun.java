package study16;

public class ArithmaticRun {
	public static void main(String[] args) {
		try {
			byte[] list = {'a','b','c'};
			System.out.println(list[5]);
			System.out.println(5/0); //jvm이 해당하는 예외처리(exception)을 만듦
			
		}catch(Exception e) {//받음
			e.printStackTrace();
			System.out.println("예외 원인:"+e.getMessage());
			System.out.println(e.toString());
			
		}finally {
			System.out.println("반드시 실행.");
			
		}

	}

}
