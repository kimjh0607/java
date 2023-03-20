package prac;



public class GenericPrinterTest {
	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powderPrinter);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
		//여기까지
		
		test t = new test();
		System.out.println(t);
	}

}

class GenericPrinter<T> {
	private T material;
	
	public void setMaterial(T material) {
		this.material=material;
	}
	
	public T getMaterial() {
		return material;
	}
	
	public String toString() {
		return material.toString();
	}
	
}
class Plastic {
	public void doPrinting() {
		System.out.println("Plastic 재료로 출력합니다.");
	}
	public String toString() {
		return "재료는 Plastic입니다";
	}
}

class Powder {
	public void doPrinting() {
		System.out.println("Powder 재료로 출력합니다.");
	}
	public String toString() {
		return "재료는 Powder입니다";
		
	}
}

class test {
	public String toString() {
		System.out.println(1);
		System.out.println(1);
		System.out.println('c');
		System.out.println(0.5);
		System.out.println(true);
		return "ddd";		
	}
}

