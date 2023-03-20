package study19;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.ToIntBiFunction;

class Student{
	private String name;
	private String city;
	private Integer age;

	//생성자 매개변수 1개, 2개 3개인 경우
	//getter setter
	//toString() 이름(도시,나이) 오버라이드
	
	Student(String name) {
		this.name=name;
	}
	Student(String name, String city) {
		this.name=name;
		this.city=city;
	}
	Student(String name, String city, int age) {
		this.name=name;
		this.city=city;
		this.age=age;
	//	this.(name,city); 도 가능
	//  this.age=age;  도 가능
	}
	
	void setName(String name) {
		this.name=name;
	}
	String getName() {
		return name;
	}
	
	void setCity(String city) {
		this.city=city;
	}
	String getCity() {
		return city;
	}
	
	void setAge(int age) {
		this.age=age;
	}
	int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return name+"("+city+","+age+")";
	}
	
	
	
}

public class StudentInfoRun {
	public static void main(String[] args) {
		//Function name 객체 Student
		Function<String, Student> func1 = new Function<String, Student>(){

			@Override
			public Student apply(String name) {
				
				return new Student(name);
			}
			
		};
		Student stu1 = func1.apply("소주");
		
		BiFunction<String, String, Student> func2 = (name, city)->new Student(name,city);
		//Student::new;
		Student stu2 = func2.apply("막걸리", "서울");
		
		stu1.setAge(15);
		stu1.setCity("서울");
		stu2.setAge(16);
				
		System.out.println(stu1.toString()+"||"+stu2.toString());
		
		//두학생의 10년 후 나이를 출력
		IntBinaryOperator oper;
		oper = new IntBinaryOperator() {
			
			@Override
			public int applyAsInt(int x, int y) {
				
				return StudentInfoRun.staticSum(x,y);
			}
		};
		oper=(x,y)->{return StudentInfoRun.staticSum(x,y);};
		int tenYearAge = oper.applyAsInt(stu1.getAge(), 10);
		System.out.println(stu1.getName()+" 10년 후 나이:"+tenYearAge);
		
		StudentInfoRun sir = new StudentInfoRun();
		oper = (x,y)->instanceSum(x,y);
		tenYearAge = oper.applyAsInt(stu2.getAge(), 10);
		
		oper = StudentInfoRun::staticSum;
	//	oper = sir::instanceSum; //??
		
		System.out.println(stu2.getName()+" 10년 후 나이:"+tenYearAge);
		
		ToIntBiFunction<String, String> func3 = (city1, city2)->city1.compareTo(city2);
		compareResult(func3.applyAsInt(stu1.getCity(), stu2.getCity()));
		
		
		
	}
	public static int staticSum(int x, int y) {
		return x+y;
	}
	public static int instanceSum(int x, int y) {
		return x+y;
	}

	public static void compareResult(int result) {
		if(result==0) {
			System.out.println("동일 문자열");
			return;
		}
		System.out.println("동일하지 않은 문자열");
	}
	
}