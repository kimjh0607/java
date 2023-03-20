package study15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
	
	int id;
	String name;
	int age;
	
	public Student(int id,String name, int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		return id+" "+name+" "+age;
	}
	
}
class AgeComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
			
		return o1.age-o2.age;
	}
	
}


public class ComparatorRun {
	public static void main(String[] args) {
		ArrayList<Student> alist = new ArrayList<>();
		alist.add(new Student(111,"구름",12));
		alist.add(new Student(222,"달",10));
		alist.add(new Student(333,"해",9));
		System.out.println(alist);
		Collections.sort(alist, new AgeComparator());
		System.out.println(alist);
		
		ArrayList<Student> alist2 = new ArrayList<>();
		alist2.add(new Student(222,"달",10));
		alist2.add(new Student(333,"해",9));
		alist2.add(new Student(111,"구름",12));
		System.out.println(alist2);
		Collections.sort(alist2, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.name.compareTo(o2.name);
			}
		});
		System.out.println(alist2);
		
		Student s1 = new Student(222,"달",10);
		Student s2 = new Student(3,"해",11);
		
		/*if(s1.age < s2.age) {
			System.out.println(s1.name+"동생이다.");
		}else if(s1.age==s2.age) {
			System.out.println("동갑이다.");
		}else {
			System.out.println(s1.name+"형이다.");
		}*/
		
		AgeComparator ac = new AgeComparator(); //나이비교 선언
		if(ac.compare(s1, s2)<0) {
			System.out.println(s1.name+"동생이다.");
		}else if(ac.compare(s1, s2)==0) {
			System.out.println("동갑이다.");
		}else {
			System.out.println(s1.name+"형이다.");
		}	
		
		
		
				
				
				
		

	}

}
