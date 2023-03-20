package study15;

public class Member implements Comparable<Member>{
	private Integer memberId;
	private String memberName;
	private Integer memberAge;
	
	public Member(int memberId, String name, int age) {
		this.memberId=memberId;
		this.memberName=name;
		this.memberAge=age;
	}
	
	@Override       
	public int hashCode() {
		return memberId.hashCode();
	}
	
	@Override          ////fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff
	public boolean equals(Object obj) {
		
		if(obj instanceof Member) {
			return ((Member) obj).getMemeberId() == this.memberId;
		}else {
			return false;
		}
	}
	
	@Override             //fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff
	public int compareTo(Member mem) {
		return memberId.compareTo(mem.getMemeberId());
	}
	
	@Override              ////ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff
	public String toString() {
		return String.format("||ID; %s||이름: %s||나이: %s||",memberId,memberName,memberAge);
	}
	
	
	

	public Integer getMemeberId() {
		return memberId;
	}

	public void setMemeberId(Integer memeberId) {
		this.memberId = memeberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public Integer getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(Integer memberAge) {
		this.memberAge = memberAge;
	}
	
	
	
	
	
}


class Point{
	private int point;
	public Point(int point) {
		this.point=point;
	}
	
	public int getPoint(){
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	@Override
	public String toString() {
		return "포인트: "+ point;
	}
	
	
	
	
	
	
	
}
