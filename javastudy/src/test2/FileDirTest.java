package test2;

import java.io.*;

public class FileDirTest {

	public static void main(String[] args) {
		String path = "D:\\workspace01\\javastudy\\src";
		File src = new File(path);
		
		//현재 폴더의 하부 파일과 디렉토리르 구분하여 출력
		
		File[] ff = src.listFiles();
		
		for(File f: ff) {
			System.out.println((f.isFile())?"파일:":"폴더:");
			
			System.out.println(f.getName()+" "+(f.isFile()?"->파일":"->디렉토리"));
	//		System.out.println(f.getName()+" \t"+(f.getPath());
		}
		
		
	/*	
		static void showHierarchy(String path) {
			File target = new File(path);
			File[] subFiles = target.listFiles();
			for(file file:subFiles) {
				if(file.isDirectory()) {
					System.out.println("폴더:"+file.getName()+"\t"+file.getPath());
				}
			}
		}
		*/
	}
}
