package study11_1;

import java.util.Spliterator;
import java.util.StringTokenizer;

public class StringTest {

	public static void main(String[] args) {
		byte[] bytes = {73,32,108,111,118,101,32,121,111,117};
		String str = new String(bytes);
		System.out.println(str);
		
		str = "모든 프로그램은 자바 언어로 개발될 수 있다.";
		//"자바" 없으면 "자바 없음"
		//있으면 "자바" -> "Java"로 바꿔서 출력.
		
		if(str.contains("자바")) {
			
			System.out.println(str.replace("자바", "Java"));
		}else {
			System.out.println("없음");
		}
		str="1,2,3,4,5,6,7,8,9,10";
		//한개의 문자열 숫자만 다 합친 겨로가값 55
		int res=0;
		//1. split() 
		String[] token = str.split(",");
		for(int i=0;i<token.length;i++) {
			System.out.print(token[i]);
		}
		System.out.println();
		/*for(String s:token) {
			System.out.print(s);
			res+=Integer.parseInt(s);
		}
		System.out.println(res);*/
		
		res=0;
		//2. StringTokenizer
		StringTokenizer stk = new StringTokenizer(str, ",");
		while(stk.hasMoreTokens()) {
			System.out.print(stk.nextToken());
			int temp = Integer.parseInt(stk.nextToken());
			System.out.print(temp);
			res += temp;
		}
		System.out.println();
		System.out.println();
		
		
		
		
		
		
		
	}
}

