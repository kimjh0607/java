package weekend;

public class ManMain {
	public static void main(String[] args) {
		Man man1 = new Man();
		man1.name = "james";
		man1.age = 40;
		man1.isMarried = true;
		man1.child = 2;
		
		System.out.println(man1.age);
		System.out.println(man1.name);
		System.out.println(man1.isMarried);
		System.out.println(man1.child);
		
	}
}
