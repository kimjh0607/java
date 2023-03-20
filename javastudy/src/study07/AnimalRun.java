package study07;

class Animal{
	String name;
	public void setName(String name) {
		this.name=name;
	}
	
	void sleep() {
		System.out.println("zzz");
	}
}
class Dog extends Animal{
	void sleep() {//변수형 메소드이름 똑같아야함
		System.out.println("그르렁 그르렁");
	}
}
class Cat extends Animal{
	void sleep() {
		System.out.println("야아옹");
	}
}
class Human extends Animal{
	void sleep() {
		System.out.println("ZzZzZz");
	}
}
class PetDog extends Dog{
	PetDog(){}
	PetDog(String name){
		this.setName(name);
	}//생성자
	@Override //annotation
	void sleep() {
		System.out.println(name+"는 골골 집에서 잡니다.");
	}
	//오버로딩(매개변수 - 갯수/타입/순서)
	void sleep(int hours) {
		System.out.println(name+"는 "+hours+"시간동안 잘 잡니다.");
	}
	
}
public class AnimalRun {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("멍멍이");
		System.out.println(dog.name);
		dog.sleep();
		
		Cat cat = new Cat();
		cat.setName("야옹이");
		System.out.println(cat.name);
		cat.sleep();
		
		Human hum = new Human();
		hum.sleep();
		hum.setName("사람");
		System.out.println(hum.name);
		
		PetDog pDog = new PetDog();
		pDog.setName("해피");
		pDog.sleep();
		pDog.sleep(24);//38행
		
		//자식클래스의 객체는 부모클래스의 자료형으로 사용가능(is-a 관계)
		Animal dog2 = new Dog();//Dog is a Animal.    부모형의 자료형으로 선언가능 - 다형성
		dog2.setName("개");
		dog2.sleep();
		
		//Dog animal = new Animal();//오류 Animal is a Dog(X)
		Dog dog3 = new PetDog("해피");//29,30,31행
		System.out.println(dog3.name);
		dog3.sleep();
		

		
		
	}
}
