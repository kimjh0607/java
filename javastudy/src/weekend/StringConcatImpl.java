package weekend;

public class StringConcatImpl{

    public void makeString(String s1, String s2) {
        System.out.println(s1+","+s2);
        print("123");
    }

    public void print(String str) {
        System.out.println("good!!"+str);
    }

    //makeString 메서드와  print 메서드 동작과 유사한 생성자를 추가해주세요
    public StringConcatImpl(String str) {
    	System.out.println("생성자1");
    }
    public StringConcatImpl(String str, String str2) {
    	System.out.println("생성자2");
    }


}