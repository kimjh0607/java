package test2;

import java.io.*;

public class FileCopyTest {
	public static void main(String[] args) {
		int data;
		int num = 1;
		
		String target = "src\\study17\\FileClassRun.java";
		String dest = "src\\study17\\FileClassRunNum.java";
		
		try {
			FileInputStream fis = new FileInputStream(target);
			FileOutputStream fos = new FileOutputStream(dest);
			InputStreamReader isr = new InputStreamReader(fis);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
		
			while((data=isr.read())!=-1) {// 
				char c = (char)data;
				if(num==1) {
					osw.write(String.valueOf(num++)+" ");
					num++;
				}
				osw.write(c);
				if(c=='\n') {
					osw.write(num);
					num++;
				}
			}
			osw.flush();
			
			osw.close();isr.close(); //
			fos.close();fis.close(); //
			
		}catch(FileNotFoundException e) {
			
			System.err.println("다음 파일이 없음 : "+target);
			
		}catch(IOException e) {
			
			System.out.println(e);
		
		}
		
		
	}
}
