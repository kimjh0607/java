package study11;

public class OuterClass {

	
	 //inner class 내부 클래스
	class Inner{
		int a = 100;
		static int con = 100;
		final static int CON = 100;
	}
	//static inner class 정적 내부 클래스
	static class StaticInner{
		int a = 200;
		static int con=200;
	}
	void method() {
		//Local inner class 지역 클래스
		class LocalInner {
			int a =300;
			static int con = 300;
			final static int CON = 300;
			public void displayNum() {
				System.out.println("a:"+a);
				System.out.println("con:"+con);
				System.out.println("CON:"+CON);
			}
			
		}
		LocalInner loc = new LocalInner();
		loc.displayNum();
	}//내부클래스를 외부에서 호출
	public static void main(String[] args) {
		System.out.println(Inner.CON);
		System.out.println(Inner.con);
		//System.out.println(Inner.a); 객체선언 요
		//Inner in = new Inner(); 내부클래스는 직접 객체 생성 불가
		OuterClass out = new OuterClass();
		OuterClass.Inner outIn = out.new Inner();
		System.out.println(outIn.a);
		
		System.out.println(StaticInner.con);
		//System.out.println(StaticInner.a); 접근불가
		OuterClass.StaticInner outSIn= new OuterClass.StaticInner(); //static Inner에 접근
		System.out.println(outSIn.a);
		
		//System.out.println(LocalInner.con);
		out.method();
		
		
		
	}

}
