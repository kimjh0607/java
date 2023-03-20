package study14;

import java.util.TreeSet;

public class Member implements Comparable<Member>{
	
	Integer memberId;
	String name;
	Integer age;
	
	Member(int id, String name, int age){
		this.memberId=id;
		this.name=name;
		this.age=age;
	}
	public Integer getMemberId() {
		return memberId;
	}
	public void setMemberId(Integer id) {
		this.memberId=id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age=age;
	}
	
	@Override
	public int hashCode() {
		return memberId.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member mem=(Member)obj;
			return this.memberId == mem.memberId;
		}else {
			return false;
		}
	}
	
	@Override
	public int compareTo(Member mem) {
		return (this.name.compareTo(mem.getName()))*(-1);
	//	return this.age.compareTo(mem.getAge());
	//	return (this.memberId.compareTo(mem.getMemberId()))*(-1);
	}
	
	
	
	



}