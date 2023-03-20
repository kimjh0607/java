package study15_2;

import java.util.*;

public class SetEx {
public static void main(String[] args) {
	
	TreeSet<Student> tSet = new TreeSet<>();
	
	tSet.add(new Student("lee" , 96));
	Student hong = new Student("hong", 86);
	tSet.add(hong);
	tSet.add(new Student("song" , 92));
	Student student = tSet.last();
	System.out.println("최고 점수 : "+student.score);
	System.out.println("최고 득점자 : "+student.name);
	
//	tSet.
	
	
//	"lee", 96
//	"hong", 86
//	"song", 92
	
	
	}



//class Student implements Comparable<Student> {
//
//	String name;
//	int score;
//	
//	Student(String name, int score){
//		this.name=name;
//		this.score=score;
//	}
	
//	@Override
//	public int compareTo(Student o) { // 비교로직, 리턴
//		int max = student.score;
//		max.compareTo(o);
//		return 
		
	}

