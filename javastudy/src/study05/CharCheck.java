package study05;

import java.util.Scanner;

public class CharCheck {
	//String 자음 모음 개수
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String in = scan.nextLine();
		int con = 0; //consonants
		int vow = 0; //vowels
		String check = in.toLowerCase();
		
		for(int i=0;i<check.length();i++) {
			char c = check.charAt(i);
			if(c>='a'&&c<='z') {
				if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u') {
					vow++;
				}else {
					con++;
				}			
			}
		}
		System.out.println("자음개수:"+con+"개/모음개수:"+vow+"개");
	}
}
