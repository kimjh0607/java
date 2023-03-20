package study01;

public class Loop2 {

	public static void main(String[] args) {
		//구구단
				for(int dan=2; dan<=9; dan++) {
					for(int t=1; t<=9; t++) {
						if(dan==5) {
							continue;
						}
						System.out.println(dan+"X"+t+"="+(dan*t));
					}
					System.out.println();
				}
	}

}
