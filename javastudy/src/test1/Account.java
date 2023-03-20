package test1;

public class Account {
	public Account(int id, String password, String ownerName) {
		//기본생성자
	}
	//필드
	//생성자
	//메서드
	
	
	int id;
	String password;
	String ownerName;
	int balance;
	
	void deposit(int money) {//
		balance += money;//
	}
	
	int withdraw(int money, String password) {
		if(isCorrectPassword(password)) {
			if(balance>=money) {
			 balance-=money;
			return balance;
		}else {
			return -2;
			}
		}else {
		return -1;
			}
	}
	int checkBalance(String password) {
		if(isCorrectPassword(password)) {
			 return balance;
			}else {
			 return -1;//암호 틀림
			}
	}
	boolean isCorrectPassword(String password) {
		return this.password.equals(password)? true : false;
			
	}
		

	
	public static void main(String[] args) {
		//계좌생성
		Account account = new Account(1,"password!@#","park");
		//10만원 입금
		account.deposit(100000);
		//잔액확인
		System.out.println(account.checkBalance("password!@#"));
		//2만원 출금
		account.withdraw(20000,"password!@#");
		//잔액확인
		System.out.println(account.checkBalance("password!@#"));
		
		
		
		
	}
}
