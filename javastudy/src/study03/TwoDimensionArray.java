package study03;

public class TwoDimensionArray {
	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		System.out.println(arr.length);
		System.out.println(arr[0].length);//arr.length=2(행의 칸)
		System.out.println(arr[1].length);//arr[0].length=(열의 수)
		
		int k=10;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=k;
				k+=10;
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
			int[][] arr2 = {
					{1,2,3},
					{4,5,6},
					{7,8,9}
			};
			
			for(int i=0; i<arr2.length; i++) {
				for(int j=0;j<arr2[i].length;j++) {
					System.out.println(arr[i][j]+" ");
				}
				System.out.println();
			}
			for(int i=0; i<arr2.length; i++) {
				for(int j=0;j<arr2[i].length;j++) {
					System.out.println("["+i+"]["+j+"]|");
					}
				System.out.println("\n----------------");
			
			}
						
	}

}
