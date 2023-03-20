package test1;

import java.util.ArrayList;
import java.util.Arrays;

public class array_sosu {
	//2)홀짝확인
		
	
	
	public static void main(String[] args) {
		int[] arr = {9,12,14,21,16,13};
		ArrayList<Integer> even = new ArrayList<>();
		ArrayList<Integer> odd = new ArrayList<>();
		
		for(int s: arr) {
			if(s%2==0) {
				even.add(s);  //2)배열에 값입력 
			}else {
				odd.add(s);
			}
		System.out.print(even);
		System.out.print(odd);
		
		//5)역순 정렬(선택정렬) -> Arrays.sort()
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] < arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
		}
	}
}
	
	
	
	
	

