package study13;

class Top{}
class Sub extends Top{}
class Cen extends Sub{}
class Bot extends Cen{}

class Team<T>{
	private T t;
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t=t;
	}
}
class Member{
	void show1(Team<Top> t) {}; //Team 객체 Top
	void show2(Team<?> t) {}; //Team 객체 아무거나
	void show3(Team<? extends Sub> t) {}; //Team 객체 Sub아래 sub cen bot
	void show4(Team<? super Sub> t) {}; //Team 객체 Sub위 sub top object
	
}

public class WildCardGeneric {
	public static void main(String[] args) {
		Member mem = new Member();
		mem.show1(new Team<Top>());
//		mem.show1(new Team<Sub>()); //show1은 Top만 받는다.
//		mem.show1(new Team<Cen>());
//		mem.show1(new Team<Bot>());
		
		mem.show2(new Team<Top>()); //show2(wildcard)는 다가능
		mem.show2(new Team<Sub>());
		mem.show2(new Team<Cen>());
		mem.show2(new Team<Bot>());
		mem.show2(new Team<Object>());
		mem.show2(new Team<Integer>());
		
//		mem.show3(new Team<Top>());
		mem.show3(new Team<Sub>());
		mem.show3(new Team<Cen>());
		mem.show3(new Team<Bot>());
		
		mem.show4(new Team<Top>());
		mem.show4(new Team<Sub>());
//		mem.show4(new Team<Cen>());
//		mem.show4(new Team<Bot>());
		mem.show4(new Team<Object>());
//		mem.show4(new Team<Integer>());
		
		
		
		
		
	}
	
		
}
