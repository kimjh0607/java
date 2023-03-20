package study15_2;

public class GenericEx {

	public static void main(String[] args) {
		Integer[] intArr = {1,2,3};
		String[] strArr = {"Hello" , "World"};
		
		printArray(intArr);
		printArray(strArr);
		
		
		
			
			
	}
	
	
	private static <T> void printArray(T[] intArr) { //T[]:T타입의 배열 //'T': 타입확인불가
		for(T t:intArr)
		System.out.println(t);
	}

}
