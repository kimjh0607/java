package study10_3;

public class ColorTV extends TV {
	
	private int resolution;
	
	public ColorTV(int size, int resolution) {
		super(size);// 1) this.size=size;
		this.resolution=resolution;
		//System.out.println(getSize()+"인치 "+resolution+"컬러");
	}
	protected int getResolution() {// 2) private res/메서드
		return resolution;
	}
	public void printProperty() {
		System.out.println(getSize()+"인치 "+resolution+"컬러");// 3) getSize()
		}
}
