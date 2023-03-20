package test2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MakeSomethingNew {
	public static void main(String[] args) throws IOException {
		//test2.files 아래로 폴더명과 파일명을 입력받아서 새로 생성
		String txt_path = "src/test2/test2.txt";
		
	//	File file = new File("src/test2/test2.txt");
		
		Scanner sc = new Scanner(System.in);
		String folderName = sc.nextLine();
		String fileName = sc.nextLine();
		
		System.out.println(folderName+" : "+fileName);
		
		//폴더생성
		String path = System.getProperty("user.dir")+"/src/test2.files";
		String folderPath = path+"/"+folderName;
		File dir = new File(folderPath);
		if(!dir.exists()) {//
			dir.mkdir();//
		}
		//파일생성
		String filePath = folderPath+"/"+fileName;
		File file = new File(filePath);
		if(!file.exists()) {
			file.createNewFile();//
		}
		if(dir.exists()&&file.exists()) {
			System.out.println("success");
		}else {
			System.out.println("fail");
		}
		
		
		
		
	}
}
