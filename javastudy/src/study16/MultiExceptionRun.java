package study16;

public class MultiExceptionRun {
	public static void main(String[] args) {
		CalTest cal = new CalTest();
		cal.exceptionProc(1, 2);
		cal.exceptionProc(2, 0);
		cal.exceptionProc(4, 2);
		
		
		

	}

}
class CalTest{
	private int[] arr = new int[3];
	CalTest() {
		arr[0] = 0;
		arr[1] = 100;
		arr[2] = 10;
		
	}
	
	public void exceptionProc(int first, int second) {
		try {
			System.out.println(arr[first]/arr[second]);
		}catch(ArithmeticException e) { // 10/0
			System.out.println("ArithmeticException");
		}catch(ArrayIndexOutOfBoundsException e) { // 없는값/10
			System.out.println("ArrayIndexOutOfBoundsException");
		}catch(Exception e) { //catch문엔 작은영역->큰영역(Exception) 순으로 작성
			System.out.println("Exception");
		}finally {
			System.out.println("finally"); 
		}
		
	}
}