package study10_3;

public class TVRun {

	public static void main(String[] args) {
		ColorTV ctv = new ColorTV(32,1024); //size,resolution /오버라이드할시 TV로 받더라도 printProperty 사용가능
		ctv.printProperty();
		//32인치 1024컬러
		//address,size,resolution
		
		//IPTV는 192.1.1.4 주소의 64인치 2048컬러
			
	}
	public class IPTV extends ColorTV{
		private String address;
		public IPTV(String address, int size, int resolution) {
			super(size, resolution);
			this.address=address;
		}
		protected String getAddress() {//
			return address;
		}
		@Override
		public void printProperty() {
			System.out.println("주소: "+" 사이즈: "+getSize()+" 인치: "+getResolution());
		}
	
	}

}
