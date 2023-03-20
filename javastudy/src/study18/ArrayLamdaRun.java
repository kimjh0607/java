package study18;

public class ArrayLamdaRun {
	public static void main(String[] args) {
		ArrIF aif = new ArrIF() {

			@Override
			public int[] sizeOfArray(int length) {
				
				return new int[length];
			}
		};
		int[] arr1 = aif.sizeOfArray(4);
		System.out.println(arr1.length);
		
		//람다식
		aif = (int length) -> {return new int[length];}; //
		aif = length -> new int[length];
		int[] arr2=aif.sizeOfArray(10);//
		aif = int[]::new;//
		System.out.println(aif.sizeOfArray(10).length);//
		
		
		
		
		ConstLamda cl = new ConstLamda() {
			
			@Override
			public TwoConst getInstance() {
				
				return new TwoConst();
			}
		};
		TwoConst tc = cl.getInstance();
		
		//람다식
		cl = () -> {return new TwoConst();};
		cl = () -> new TwoConst();
		cl = TwoConst::new;
		cl.getInstance();
		
		
		ConstLamdaWithParam clp = new ConstLamdaWithParam() {
			@Override
			public TwoConst getInstance(String str) {
				return new TwoConst(str);
			}
		};
		clp.getInstance("Hi");
		
		//람다식
		clp = (String str) ->  {return new TwoConst(str);};
		clp = str -> new TwoConst(str);
		clp = TwoConst::new;//생성자참조
	//	clp.getInstance();
		
		
	}
	
}

interface ArrIF{
	int[] sizeOfArray(int length);
}

class TwoConst{
	TwoConst(){
		System.out.println("기본생성자");
	}
	TwoConst(String str){
		System.out.println("매개변수 생성자"+str.toString());
	
	}
}

interface ConstLamda{
	TwoConst getInstance();
}
interface ConstLamdaWithParam{
	TwoConst getInstance(String str);
}