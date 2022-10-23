package school;

public class Score {
	int studentId;
	Subject subject;
	int point;
	
	public Score(int studentId, Subject subject, int point) {
		this.studentId = studentId;
		this.subject = subject;
		this.point = point;
	}
	
	//studentId
	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	//subject
	public Subject getSubject() {
		return subject;
	}
	
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	//point
	public int getPoint() {
		return point;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}
	
	//toString
	public String toString(){
		return "학번:" + studentId + "," + subject.getSubjectName() + ":" + point;
	}


}
