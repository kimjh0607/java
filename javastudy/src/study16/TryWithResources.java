package study16;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TryWithResources {
	public static void main(String[] args) {
		Scanner sc = null;  //멤버변수로 선언, try finally에서 사용가능
		try {
			sc = new Scanner(new File("D:\\workspace01\\javastudy\\src\\study16\\input.txt"));
			System.out.println(sc.nextLine());
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(sc!=null) {
				sc.close();
			}
		}
		
	}
}
