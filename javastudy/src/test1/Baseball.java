package test1;



import java.util.Random;

public class Baseball {

	public static void main(String[] args) {
		int count = 3; // 난수 생성 갯수
		int[] arr = new int[count];
		Random ran = new Random();
		
		for(int i=0; i<count; i++){
			arr[i] = ran.nextInt(9) ; // 0 ~ 9까지의 난수 
			for(int j=0; j<i; j++){
				if(arr[i] == arr[j]){ //중복제거
					i--;
				}
			}
		}
		for(int i=0; i<count; i++){
			System.out.println("난수 " + i + " : " + arr[i]);
		}
	}
}
	
	
	
