package prac;

public class Human {
	
	Human(String name, char gender, int age){
		this.name=name;
		this.gender=gender;
		this.age=age;
	}
	
	Human(int age){
		this.age=age;
	}
	
	String name;
	char gender;
	int age;
		
	void sleep() {
		System.out.println("잠잔다");
	}
	
	int checkAge() {
		return age;
	}
	
}
