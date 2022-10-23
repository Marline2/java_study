package school;
import java.util.ArrayList;

public class Student {
	
	private int studentId;
	private String studentName;
	private Subject majorSubject;
	
	private ArrayList<Score> scoreList = new ArrayList<Score>(); 

	
	public Student(int studentID, String studentName, Subject majorSubject){
		this.studentId = studentID;
		this.studentName = studentName;
		this.majorSubject = majorSubject;
	}
	
	//studentId
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	//studentName
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	//major
	public Subject getMajorSubject() {
		return majorSubject;
	}

	public void setMajorSubject(Subject majorSubject) {
		this.majorSubject = majorSubject;
	}
	
	//score
	public void addSubjectScore(Score score){
		scoreList.add(score);
	}
	
	public ArrayList<Score> getScoreList(){
		return scoreList;
	}
	
	public void setScoreList(ArrayList<Score> scoreList) {
		this.scoreList = scoreList;
	}


}
