package study06;

public class VarTestRun {
	
	int k; //인스턴스 변수,
	
	int localVal(int l) {
		this.k++;//윗k
		return ++l;
	}
		
	
	public static void main(String[] args) { 
		int a = 1; //지역변수,초기화
		//사용할 메소드를 포함한 클래스의 객체를 생성
		VarTestRun vtr = new VarTestRun();
		a = vtr.localVal(a);
		System.out.println(a);
		//객체.멤버변수명
		System.out.println(vtr.k);
		
		
		
	}
}
