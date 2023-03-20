package test1;

public class PersonerNumber {
	
	
	String str;
		
	
	
	public static void main(String[] args) {
		
		String str = "871130-1463217";
		System.out.println("19"+str.substring(0,2)+"년"+str.substring(2,4)+"월"+str.substring(4,6)+"일\n");
		System.out.println(str.charAt(7));
		/*
			
		System.out.println(Integer.parseInt();
		*/
		
		if(Integer.parseInt("1",10)/2==0||Integer.parseInt("1",10)<0) {
			System.out.println("여성");
		}else {
			System.out.println("남성");
		}
	
	}
	
}
