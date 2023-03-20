package aa;

import java.io.*;
import java.util.*;

public class MemberManagement {

	public static void main(String[] args) throws IOException {
		
		//고객리스트 가져오기
		List<Member> memList = new ArrayList<>();
		
		try {
			
			FileReader fr = new FileReader("D:\\workspace01\\javastudy\\src\\aa\\MemberList\\MemberList01");
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			
			while((line=br.readLine())!=null) {
				String[] strarr = line.split("\\s+");
				String name = strarr[0];
				int age = Integer.parseInt(strarr[1]);
				int cons = Integer.parseInt(strarr[2]);
				Member mem = new Member(name , age , cons);
				memList.add(mem);
				
			}
		}catch (FileNotFoundException e) {
			System.out.println("파일없음");
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("에러발생");
			e.printStackTrace();
		}
		
		//변수 consumption 순위
		Collections.sort(memList, new Comparator<Member>() {
			@Override
			public int compare(Member o1, Member o2) {
				return o2.getCons() - o1.getCons();
			}
		});
		
		for(Member mem : memList) {
			System.out.println(mem);
		}
	
		//저장 FileWriter
		try {
			
			FileWriter fw = new FileWriter("D:\\workspace01\\javastudy\\src\\aa\\MemberList\\MemberList01");
			for (Member mem : memList) {
				fw.write(mem.toString()+"\n");
			}
			fw.flush();
			fw.close();
			
		}catch(Exception e) {
			System.out.println("에러발생");
			e.printStackTrace();
		}
		
	}

}
