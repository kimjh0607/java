package study16;

class CustomResource implements AutoCloseable{
	public CustomResource() {
		System.out.println("CustomResources 생성자");
	}
	public void printMessage() {
		System.out.println("CustomResources 메소드 실행");
	}
	@Override
	public void close() throws Exception {
		System.out.println("CustomResources 요소 반환");
	}
}

class CustomResource2 implements AutoCloseable{
	public CustomResource2() {
		System.out.println("CustomResources2 생성자");
	}
	public void printMessage() {
		System.out.println("CustomResources2 메소드 실행");
	}
	@Override
	public void close() throws Exception {
		System.out.println("CustomResources2 요소 반환");
	}
}

public class CustomResourceClose {

	public static void main(String[] args) {
		try(CustomResource cus = new CustomResource();
			CustomResource2 cus2 = new CustomResource2();
				){
			cus.printMessage();
			cus2.printMessage();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
