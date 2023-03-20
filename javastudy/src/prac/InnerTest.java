package prac;

class OutClass{
	private int num = 10;
	private static int sNum = 20;
	
	static class InStaticClass{
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() { //정적내부클래스의 일반 메서드
			//num+=10; //외부클래스의 인스턴스 변수는 사용불가
			System.out.println("InStaticClass inNum = " + inNum + "(내부클래스의 인스턴스변수사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부클래스의 정적변수사용)");
			System.out.println("OutClass sNum = " + sNum + "(외부클래스의 정적변수사용)");
			
		}
		static void sTest() {
			//num+=10;
			//inNum+=10;  //외부클래스와 내부클래스의 인스턴스 변수는 사용불가
			
			System.out.println("OutClass sNum = " + sNum + "(외부클래스의 정적변수사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부클래스의 정적변수사용)");
		
		}
	}
	
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	
	class InClass{
		int inNum = 100;
	//	static int sInNum = 200;
		
		void inTest() {
			System.out.println("OutClass num ="+num+"(외부클래스의 인스턴스변수)");
			System.out.println("OutClass sNum ="+sNum+"(외부클래스의 정적변수)");
		}
	
	//static void sTest(){
	//}
	
	
	}
	public void usingClass() {//1
		inClass.inTest();//2
	}
	
}


public class InnerTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		outClass.usingClass();//호출
		
		System.out.println();
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		System.out.println("정적 내부 클래스 일반 메서드 호출");
		sInClass.inTest();
		System.out.println();
		System.out.println("정적 내부 클래스의 정적 메서드 호출");
		OutClass.InStaticClass.sTest();
		
		
		
		
	}
}
