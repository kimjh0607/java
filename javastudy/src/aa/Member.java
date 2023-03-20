package aa;

import java.io.*;
import java.util.*;

public class Member implements Comparator<Member>{
    
	private String name;
	private int age;
	private int cons;
	private String consGrade;
   
	public Member() {}
    
    public Member(String name, int age, int cons) {
        this.name = name;
        this.age = age;
        this.cons = cons;
        setGrade(cons);
    }
        
    public String getName() {
        return name;
    }
        
    public int getAge() {
        return age;
    }
       
    public int getCons() {
    	return cons;
    }
        
    public String getConsGrade() {
    	return consGrade;
    }
    
    public void setGrade(int cons) {
    	if(cons < 400) {
    		consGrade = "일반회원";
    	}else if(cons >= 400 && cons < 1500) {
    		consGrade = "Blue";
    	}else if(cons >= 1500 && cons <2500) {
    		consGrade = "Black";
    	}else if(cons >= 2500 && cons < 4500) {
    		consGrade = "Paltinum";
    	}else if(cons >= 4500 && cons <7000) {
    		consGrade = "Vip";
    	}else {
    		consGrade = "Vvip";
    	}
    }
    
    @Override
    public String toString() {
    	return String.format("고객명: %-5s|| 연령: %-2d세|| 구매액: %-5d만원|| 등급: %-5s ",name , age , cons , consGrade);
    }

	@Override
	public int compare(Member o1, Member o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}