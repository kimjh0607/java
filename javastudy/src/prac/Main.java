package prac;

import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		
		
		ArrayList<Human> age = new ArrayList<>();
		
		for(int index=1; index<=10; index++) {
			age.add(new Human(index));
		}
		
		int sum=0;
		for(Human h : age) {
			sum+=h.age; 
		}
		System.out.println(sum);
	}

}
