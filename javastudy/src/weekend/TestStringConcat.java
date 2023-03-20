package weekend;

class GoodDay2{
    public void print(String str) {
        System.out.println("good"+str);
    }

    //print 메서드를 인자,리턴 없는 경우도 오버로딩하여 "오버로딩 메서드" 내용 출력하는 메서드 작성
}

public class TestStringConcat {
    public static void main(String[] args) {
    	
    	
    	// GoodDay2 클래스 객체로 만들어 오버로딩 메서드 사용
    	GoodDay2 gd2 = new GoodDay2();
    	gd2.print("day");
    	
        //StringConcatImpl 클래스에 적힌 주석대로 생성자를 만들고 사용
    	StringConcatImpl sci = new StringConcatImpl("생성");
    	
        //testPrint1 메서드 사용
    	GunheeTestClass1 g1 = new GunheeTestClass1();
    	//GunheeTestClass1.GunheeTestClass2 ght=new GunheeTestClass1.GunheeTestClass2();
    	
        //testPrint2 메서드 사용
    	GunheeTestClass1.testPrint2();
    	
    	
    	TestStringConcat c = new TestStringConcat();
    	c.pr5();
    	

    }
    
    public void pr5() {
    	System.out.println("성공");
    }
}

class GunheeTestClass1{
	
        class GunheeTestClass2{
            public void testPrint1(){
                System.out.println("Good jab1");
            }
        }
        public static void testPrint2(){
            System.out.println("Good jab2");
        }
}