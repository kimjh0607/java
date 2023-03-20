package study09;

public class ComTest {
	public static void main(String[] args) {
		//추상클래스는 객체 생성이 불가함.
		//Computer com = new Computer();
		//추상클래스는 객체 생성 방법
		//1.자식클래스를 생성하면서 함께 만드는 방법
		Computer com = new Desktop();
		//2.익명클래스를 통해서 생성하는 방법
		Computer com2 = new Computer() {
			@Override
			public void typing() {//추상클래스를 구현해버림
				System.out.println("익명내부클래스"); 
			}
		};
		com2.typing();
		com.display();
		com.typing();
		com.turnOn();
		com.turnOff();
		
		Computer com3 = new PortableNoteBook();
		NoteBook note = new PortableNoteBook();
		com3.display();
		note.display();
		com3.typing();
		note.typing();
		
	}
}
