package test1;

public class PersonnrNum {
	
	String str;
		
	public static void main(String[] args) {
		
		String str = "871130-1463217";
		System.out.println("19"+str.substring(0,2)+"년"+str.substring(2,4)+"월"+str.substring(4,6)+"일");
		System.out.println(str.charAt(7));
		//int str2 = Integer.parseInt(str);
		//System.out.println(str2);
		
		
		if(Integer.parseInt("1",10)==1||Integer.parseInt("1",10)/2==1) {
			System.out.println("남성");
		}else if(Integer.parseInt("1",10)/2==0) {
			System.out.println("여성");
		}
	
	}
}
