package school;
import java.util.ArrayList;

public class Subject {
	private int subjectId;
	private String subjectName;
	private int gradeType;
	
	private ArrayList<Student> studentList = new ArrayList<Student>();
	
	public Subject(int subjectId, String subjectName) {
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.gradeType = Define.AB_TYPE;
	}
	
	//subjectId
	public int getSubjectId() {
		return subjectId;
	}
	
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	
	//subjectName
	public String getSubjectName() {
		return subjectName;
	}
	
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	//gradeType
	public int getGradeType() {
		return gradeType;
	}
	
	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}
	
	//studentList
	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
	
	//register 
	public void register(Student student){  
		studentList.add(student);
	}


}
