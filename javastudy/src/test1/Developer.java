package test1;

public class Developer {
	
	Developer() {}
	
	public String name;
	public int career; //연차
	
	
	public void level() {
		if(career<3) {          
			System.out.println("Beginner");
		}else if(career<7){     
			System.out.println("Junior");
		}else if(career>=7){    
			System.out.println("Senior");
		}
	}
	
	public void calSalary() {
		//this.career=career;
		int salary=2800;
		int salary2 = salary+700;
		int salary3 = salary+1700;
		if(career<3) {
			salary+=100*career;
			System.out.println(salary);
		}else if(career<7) {
			salary2+=100*career;
			System.out.println(salary2);
		}else if(career>=7) {
			salary3+=100*career;
			System.out.println(salary3);
		}
				
	}
		public void showDeveloperInfo(String name, int career) {
		this.name=name;
		this.career=career;
		System.out.println("이름: "+name);
		System.out.println("경력: "+career);
	}
	

}
//level단계계산 salary연봉계산