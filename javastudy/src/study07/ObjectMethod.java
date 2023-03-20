package study07;

class Value{//extends Object (모두의 부모니까?)
	int value;
	Value(int value){ //생성자
		this.value=value;
	}
}
class Cost{//extends Object
	int cost;
	Cost(int cost){
		this.cost=cost;
	}
	@Override
	public String toString() {
		return "Cost toString() override";//?
	}
}
public class ObjectMethod {

	public static void main(String[] args) {
		Object o = new Object();
		//
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		System.out.println(v1.equals(v2)); //주소값 다름(다른 객체)
		v1=v2;                             //대입 후
		System.out.println(v1.equals(v2)); //주소값 같아짐(객체 값은 변화X)
		
		//hashCode
		Value v3 = new Value(12);
		Value v4 = new Value(12);
		
		System.out.println(v3.hashCode());
		System.out.println(v4.hashCode());
		
		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());
		//toString()
		Cost c1 = new Cost(20);
		System.out.println(v3);
		System.out.println(v3.toString());
		System.out.println(v4.toString());
		System.out.println(c1);
		System.out.println(c1.toString());//?
		//getClass
		Class c1c = c1.getClass();
		System.out.println(c1c.getName());
		Class c1c2 = Cost.class;
		System.out.println(c1c2.getName());
		//clone() = > array 복사
		
		
		
	}

}
