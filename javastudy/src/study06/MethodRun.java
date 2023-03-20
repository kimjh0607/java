package study06;

public class MethodRun {
	//매개변수는 없고 반환값은 있는 경우
	String sayHi() {
		return "HI~";
	}
	//매개변수는 있고 반환값이 없는 경우
	void sum(int a, int b){
		System.out.println(a+b);
	}
	//return;
	void sayNickname(String nick) {
		if("asshole".equals(nick)){//입력값nick과 asshole 비교
			return;
		}else {
			System.out.println("My nickname is "+nick);
		}
	}
	
	public static void main(String[] args) {
		//사용할 메소드를 포함한 클래스 객체를 생성
		MethodRun mr = new MethodRun(); //객체생성
		//해당 메소드를 호출
		//반환값(4행의 String) 변수명(res) = 객체(mr).메소드명(sayHi());
		String res = mr.sayHi(); //mr
		System.out.println(res);
		
		//객체.메소드명 -> 반환값 없는 경우 = 반환값 변수명 불요
		mr.sum(3, 2);
		
		mr.sayNickname("asshole2");
	}
	

}
