package practice;

public class Practice {

	public static void main(String[] args) {
		String[] a = {"1","2","3"};
		int[] b = {1,2,3};
		print(a);
	//	print(b);
		
		
		
	}
	
	
	
	static <T> void print(T[] t) {
		for(T arr : t) {
		System.out.print(arr);
	}
}
}
