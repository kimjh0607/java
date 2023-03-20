package study10_3;

public interface Stack {
	int length(); //현재 스택에 저장된 갯수
	int capacity(); //스택의 전체 저장 가능한 갯수
	String pop(); //스택의 맨 위쪽의 값 반환
	boolean push(String value);//스택의 맨 위에 값 저장
	
}
