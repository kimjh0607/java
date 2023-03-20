package study13;

interface TestInterface{
	public abstract void test();
}
class SubClass implements TestInterface{

	@Override
	public void test() {
		System.out.println("subclass test() run");
	}
	
}

class NormalClass{//클래스에서의 T와 메서드안의 T는 다름@@@@
	public <T extends TestInterface> void genericMethod(T t) { //꺾새 안@@@@
		t.test();
	}
}

public class LimitedTypeGenericClass2 {
	public static void main(String[] args) {
		NormalClass nc = new NormalClass();
		nc.genericMethod(new SubClass()); //TestInterface를 구현하는건 subclass뿐.
		
		nc.genericMethod(new TestInterface() {
			@Override
			public void test() {  //익명클래스
				System.out.println("anonymous class test() run"); 
			}
		});
		
		
		
		
		
	}
	
	

}
