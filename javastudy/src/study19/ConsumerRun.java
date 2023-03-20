 package study19;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
 
public class ConsumerRun {
	public static void main(String[] args) {
		
		Consumer<String> c = new Consumer<String>() {

			@Override
			public void accept(String t) { //Consumer 안에 있는 accept<T>메서드 
				System.out.println(t);
			}
		};
		
		c.accept("안녕하세요");
		Consumer<String> c2 = t -> System.out.println(t);
		Consumer<String> c3 = System.out::println; // 클래스::메서드명
		c3.accept("안녕");
		c2.accept("녕안");
		
		IntConsumer c4 = num -> {System.out.println(num);};                     //타입이int
		LongConsumer c5 = num -> {System.out.println(num);};
		DoubleConsumer c6 = num -> {System.out.println(num);};
		BiConsumer<String, Integer> c7 = (name,age) -> {System.out.println(name+age);};    //Bi타입<B,T> 
		
		c7.accept("윤미래", 40);
		
	}
}
