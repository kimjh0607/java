package study02;

public class Student {
	String studentName;
	int studentId;
	String address;
	String gender;
	
	Subject korea;
	Subject math;
	Subject english;
	
	public Student() {
		korea = new Subject();
		math = new Subject();
		english = new Subject();
		
	}

	public Student(int studentId, String studentName, String gender) {
		this();
		this.studentId=studentId;
		this.studentName=studentName;
		this.gender=gender;
		
	}
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public void showStudentInfo() {
		System.out.println(studentId+","+studentName+","+address+","+gender);
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Subject getKorea() {
		return korea;
	}

	public void setKorea(Subject korea) {
		this.korea = korea;
	}

	public Subject getMath() {
		return math;
	}

	public void setMath(Subject math) {
		this.math = math;
	}

	public Subject getEnglish() {
		return english;
	}

	public void setEnglish(Subject english) {
		this.english = english;
	}
	
	
}
