package study15_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

class PersonInfo{
	private String name;
	private String address;
	
	public PersonInfo(String name, String address) { //
		this.name=name;
		this.address=address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}

class PersonInfoList{//객체생성
	private HashMap<String, PersonInfo> pList; //String타입, PersonInfo타입
	PersonInfoList(){
		pList = new HashMap<String, PersonInfo>();
	}
	void addPersonInfo(String name, String telNum,String address) {
		PersonInfo pInfo = new PersonInfo(name, address);
		pList.put(telNum, pInfo);
		
	}
	String getPersonInfoWithName(String name) {
		Set<Entry<String,PersonInfo>> entrySet = pList.entrySet();   //pList에서 키-밸류 값 가져오기 / 이름 주소값 변수타입 = PersonInfo
		Iterator<Entry<String, PersonInfo>> entry = entrySet.iterator();
		while(entry.hasNext()) { 
			Entry<String, PersonInfo> en = entry.next();   //키-밸류 값 가져오기
			PersonInfo pInfo = en.getValue();              //밸류값 저장하기
			if(pInfo.getName().equals(name)) {             //String값 비교하는 메서드 equals 사용
				String eName = pInfo.getName();		       //그중 이름저장
				String eTel = en.getKey();                 //그중 키값저장
				String eAddr = en.getValue().getAddress(); //그중 주소저장
				return "||이름:"+eName+"||전화번호:"+eTel+"||주소:"+eAddr+"||";
				
			}
		}
		return 	"해당 검색 대상이 없습니다.";
		
	}
	public ArrayList<String> getPersonInfoWithTel(String telNum) { //List ArrayList
		ArrayList<String> results = new ArrayList<>();
		Set<String> keySet = pList.keySet();        //keySet메서드 이용해 키값 받아오기 
		Iterator<String> keys = keySet.iterator();
		while(keys.hasNext()) {
			String key = keys.next();                               //이름으로 찾는다? Person pInfo = pList.get(key); 
			if(key.contains(telNum)) {             //키값            //'pInfo.getName().contains(name)'
				PersonInfo pInfo = pList.get(key); //이름 주소 저장하기
				results.add("||이름:"+pInfo.getName()+"||전화번호:"+key+"||주소:"+pInfo.getAddress()+"||");
				
			}
		}
		if(results.size()==0) {
			results.add("해당 검색 대상이 없습니다.");
		}
		return results;
	}
		
//		if(pList.containsKey(telNum)) {                   //키가 있는지 확인, 키값으로 밸류값찾기
//			PersonInfo pInfo = pList.get(telNum);
//			return "||이름:"+pInfo.getName()+"||전화번호:"+telNum+"||주소:"+pInfo.getAddress();
//		}else {
//			return "해당 검색 대상이 없습니다.";
//		}
//		
//	}
	
	public HashMap<String, PersonInfo> getpList() {
		return pList;
	}
	
	public void setpList(HashMap<String, PersonInfo> pList) {
		this.pList = pList;
	}
	
	
}     //이름으로 찾기, 부분이름, 부분번호로더 조회하기.              

public class HashMapPrac {
	 public static void main(String[] args) {
		
	
	 PersonInfoList pList = new PersonInfoList();
	 pList.addPersonInfo("인순이","010-1111-1111","서울");
	 pList.addPersonInfo("권보아","010-2222-2222","대전");
	 pList.addPersonInfo("이보람","010-3333-3333","대구");
	 Scanner scan = new Scanner(System.in);
	 System.out.println("<<전화번호 목록>>");
	 while(true) {
		List<String> result = new ArrayList<>();
		System.out.println("조회대상 선택\n1.이름\n2.전화번호");
		System.out.println("3.종료");
		System.out.print("선택:");
		
		int menu = scan.nextInt();
		
		if(menu==1) {
		System.out.println("이름입력");
		String search = scan.next();
		String result1 = pList.getPersonInfoWithName(search);
		System.out.println(result);
		
		}else if(menu==2) {
		System.out.print("<검색>\n전화번호:");
		String search = scan.next();
		result = pList.getPersonInfoWithTel(search);
		}else {
			System.out.println("검색종료");
			break;
		
		}for(String res : result) {
			System.out.println(res);
		}
		 
		 
		 
		 
	  }
	
	}
}
























